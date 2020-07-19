package SymbolTable;

//SymbolTable --> ���Ḯ��Ʈ ���
class ListNode {
	private String data; // ������ ���� ����
	public ListNode link; // �ٸ� ��带 ������ ��ũ ���

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

	private ListNode head; // ListNode Ÿ���� head ��� �ν��Ͻ� ����

	// LinkedList ������
	public SymbolTable_Linked_List() {
		head = null; // head ��� �ʱ�ȭ
	}

	// Node ���� (�������� ����)
	public void insertNode_tail(String data) {
		ListNode newNode = new ListNode(data); // ���ο� ��� ����
		if (head == null) {
			// head ��尡 null�� ��� ���ο� ��带 �����ϵ��� ��
			this.head = newNode;
		} else {
			// head ��尡 null�� �ƴ� ��� temp ��尡 head�� ����.
			// tempNode�� ������ ��带 ã�Ƽ� �����ϱ� ���� ���.
			ListNode tempNode = head;

			// temp ����� link�� null�� �ƴ� ������ ���� ��带 ����.
			// tempNode.link�� ���� ��带 �����ϰ� �����Ƿ�,
			// tempNode = tempNode.link�� tempNode�� ���� ��带 �����ϵ��� �ϴ� ��.
			// while���� ��� ����Ǹ� tempNode�� ���� ������ ��带 �����ϰ� ��.
			while (tempNode.link != null) {
				tempNode = tempNode.link; // ���� ��带 ����
			}

			// tempNode(������ ���)�� link�� ���� ��带 �����ϵ��� ��.
			tempNode.link = newNode;
		}
	}

	// Node Ž��
	public ListNode searchNode(String data) {
		ListNode tempNode = this.head; // temp ��忡 head�� ����Ű�� ù ��° �Ҵ�.

		// temp ��尡 null�� �ƴ� ������ �ݺ��Ͽ� Ž��
		while (tempNode != null) {
			// �־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ��� �ش� temp ��带 return
			if (data.equals(tempNode.getData())) {
				return tempNode;
			} else {
				// �����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�.
				tempNode = tempNode.link;
			}
		}

		return tempNode;
	}

	// ����Ʈ�� ��带 �������� ����
	public void reverseList() {
		ListNode nextNode = head; // head�� �����ϴ� ù��° ��带 �Ҵ�.
		ListNode currentNode = null;
		ListNode preNode = null;

		// nextNode�� ���������� �̵��ϸ� currentNode�� link�� preNode�� �����ϵ��� ��.
		// 1) preNode�� currentNode ��ġ�� �̵�
		// 2) currentNode�� nextNode ��ġ�� �̵�
		// 3) nextNode�� ���� ��� ��ġ�� �̵�
		// 4) currentNode�� link�� preNode�� �����ϵ��� ��
		while (nextNode != null) {
			preNode = currentNode; // preNode�� currentNode ��ġ�� �̵�
			currentNode = nextNode; // currentNode�� nextNode ��ġ�� �̵�
			nextNode = nextNode.link; // nextNode�� ���� ��� ��ġ�� �̵�
			currentNode.link = preNode; // currentNode�� link�� preNode�� �Ҵ��Ͽ� �������� ����
		}

		head = currentNode; // currentNode�� ������ ��带 ����ų ��, head�� currentNode�� �����ϵ��� ��.
	}

	// ���� ����Ʈ�� ����� ��� �����͸� ���
	public void printList() {
		ListNode tempNode = this.head; // tempNode�� head�� ����Ű�� ù��° ��带 �Ҵ�

		// tempNode�� null�� �ƴ� ������ �ݺ��Ͽ� ���
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.link; // temp ��忡 ���� ���(tempNode.link) �Ҵ�.
		}
		System.out.println();
	}

	public static void main(String args[]) {
		SymbolTable_Linked_List linkedList_1 = new SymbolTable_Linked_List(); // ���� ����Ʈ ����

		linkedList_1.insertNode_tail("b");
		linkedList_1.insertNode_tail("a");
		linkedList_1.insertNode_tail("c");
		linkedList_1.insertNode_tail("d");
		linkedList_1.insertNode_tail("e");
		linkedList_1.printList();

		String str = "a";
		System.out.println(linkedList_1.searchNode(str).getData());

		linkedList_1.reverseList(); // �������� ����
		linkedList_1.printList(); // �������� ������ ����Ʈ ���

	}

}
