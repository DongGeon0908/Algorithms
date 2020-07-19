package SymbolTable;

//SymbolTable --> 연결리스트 사용
class ListNode {
	private String data; // 데이터 저장 변수
	public ListNode link; // 다른 노드를 참조할 링크 노드

	public ListNode() {
		this.data = null;
		this.link = null;
	}

	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}

	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}

	public String getData() {
		return this.data;
	}
}

public class SymbolTable_Linked_List {

	private ListNode head; // ListNode 타입의 head 노드 인스턴스 변수

	// LinkedList 생성자
	public SymbolTable_Linked_List() {
		head = null; // head 노드 초기화
	}

	// Node 삽입 (마지막에 삽입)
	public void insertNode_tail(String data) {
		ListNode newNode = new ListNode(data); // 새로운 노드 생성
		if (head == null) {
			// head 노드가 null인 경우 새로운 노드를 참조하도록 함
			this.head = newNode;
		} else {
			// head 노드가 null이 아닌 경우 temp 노드가 head를 참조.
			// tempNode는 마지막 노드를 찾아서 참조하기 위해 사용.
			ListNode tempNode = head;

			// temp 노드의 link가 null이 아닐 때까지 다음 노드를 참조.
			// tempNode.link는 다음 노드를 참조하고 있으므로,
			// tempNode = tempNode.link는 tempNode에 다음 노드를 참조하도록 하는 것.
			// while문이 모두 실행되면 tempNode는 가장 마지막 노드를 참조하게 됨.
			while (tempNode.link != null) {
				tempNode = tempNode.link; // 다음 노드를 참조
			}

			// tempNode(마지막 노드)의 link가 다음 노드를 참조하도록 함.
			tempNode.link = newNode;
		}
	}

	// Node 탐색
	public ListNode searchNode(String data) {
		ListNode tempNode = this.head; // temp 노드에 head가 가리키는 첫 번째 할당.

		// temp 노드가 null이 아닐 때까지 반복하여 탐색
		while (tempNode != null) {
			// 주어진 데이터와 temp 노드의 데이터가 일치할 경우 해당 temp 노드를 return
			if (data.equals(tempNode.getData())) {
				return tempNode;
			} else {
				// 데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당.
				tempNode = tempNode.link;
			}
		}

		return tempNode;
	}

	// 리스트의 노드를 역순으로 구성
	public void reverseList() {
		ListNode nextNode = head; // head가 참조하는 첫번째 노드를 할당.
		ListNode currentNode = null;
		ListNode preNode = null;

		// nextNode가 순차적으로 이동하며 currentNode의 link가 preNode를 참조하도록 함.
		// 1) preNode를 currentNode 위치로 이동
		// 2) currentNode는 nextNode 위치로 이동
		// 3) nextNode는 다음 노드 위치로 이동
		// 4) currentNode의 link는 preNode를 참조하도록 함
		while (nextNode != null) {
			preNode = currentNode; // preNode는 currentNode 위치로 이동
			currentNode = nextNode; // currentNode는 nextNode 위치로 이동
			nextNode = nextNode.link; // nextNode는 다음 노드 위치로 이동
			currentNode.link = preNode; // currentNode의 link에 preNode를 할당하여 역순으로 설정
		}

		head = currentNode; // currentNode가 마지막 노드를 가리킬 때, head는 currentNode를 참조하도록 함.
	}

	// 연결 리스트에 저장된 모든 데이터를 출력
	public void printList() {
		ListNode tempNode = this.head; // tempNode에 head가 가리키는 첫번째 노드를 할당

		// tempNode가 null이 아닐 때까지 반복하여 출력
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.link; // temp 노드에 다음 노드(tempNode.link) 할당.
		}
		System.out.println();
	}

	public static void main(String args[]) {
		SymbolTable_Linked_List linkedList_1 = new SymbolTable_Linked_List(); // 연결 리스트 생성

		linkedList_1.insertNode_tail("b");
		linkedList_1.insertNode_tail("a");
		linkedList_1.insertNode_tail("c");
		linkedList_1.insertNode_tail("d");
		linkedList_1.insertNode_tail("e");
		linkedList_1.printList();

		String str = "a";
		System.out.println(linkedList_1.searchNode(str).getData());

		linkedList_1.reverseList(); // 역순으로 구성
		linkedList_1.printList(); // 역순으로 구성한 리스트 출력

	}

}
