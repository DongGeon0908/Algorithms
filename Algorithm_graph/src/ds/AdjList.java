package ds;
import java.util.Iterator;

public class AdjList implements Iterable {

	// 가중치가 없음
	private class Node {
		int vertex;
		Node next;
	}

	// 첫번째 값
	private Node first;

	// 추가
	public void add(int d) {
		Node oldfirst = first;
		first = new Node();
		first.vertex = d;
		first.next = oldfirst;
	}

	//Iterator을 이용해서 클래스 출력
	private class ListIterator implements Iterator {
		private Node current = first;

		public boolean hasNext() {
			return current != null;
		}

		public Object next() {
			int v = current.vertex;
			current = current.next;
			return v;
		}
	}

	public Iterator iterator() {
		return new ListIterator();
	}

	public static void main(String[] args) {
		AdjList lst = new AdjList();
		lst.add(3);
		lst.add(5);
		lst.add(1);

		for (Object x : lst) {
			System.out.println(x);
		}

	}
}
