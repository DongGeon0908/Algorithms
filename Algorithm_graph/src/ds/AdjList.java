package ds;
import java.util.Iterator;

public class AdjList implements Iterable {

	// ����ġ�� ����
	private class Node {
		int vertex;
		Node next;
	}

	// ù��° ��
	private Node first;

	// �߰�
	public void add(int d) {
		Node oldfirst = first;
		first = new Node();
		first.vertex = d;
		first.next = oldfirst;
	}

	//Iterator�� �̿��ؼ� Ŭ���� ���
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
