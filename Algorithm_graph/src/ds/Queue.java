package ds;

public class Queue {

	private Node first;
	private Node last;
	private int size;

	private class Node {
		int vertex;
		Node next;
	}

	// ª¿‘
	public void enqueue(int d) {
		Node oldlast = last;
		last = new Node();
		last.vertex = d;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
		size++;
	}

	// ªË¡¶
	public int dequeue() {
		int d = first.vertex;
		first = first.next;
		size--;
		if (isEmpty()) {
			last = null;
		}

		return d;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(1);
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println("size = " + q.size());
	}

}
