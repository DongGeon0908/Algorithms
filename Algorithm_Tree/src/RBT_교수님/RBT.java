package RBT_±³¼ö´Ô;

public class RBT<K extends Comparable<K>, V> {

	private static final boolean RED = true;
	private static final boolean BLACK = false;

	private class Node {
		private K key;
		private V val;
		private Node left, right;
		private boolean color;

		public Node(K k, V v, boolean color) {
			this.key = k;
			this.val = v;
			this.color = color;
		}
	}

	private Node root;

	public RBT() {
	}

	private Node search(Node node, K k) {
		if (node == null)
			return null;
		int cmp = k.compareTo(node.key);
		if (cmp < 0)
			return search(node.left, k);
		else if (cmp > 0)
			return search(node.right, k);
		else
			return node;
	}

	public Node search(K k) {
		return search(root, k);
	}

	private Node insert(Node node, K k, V v) {
		if (node == null)
			return new Node(k, v, RED);
		int cmp = k.compareTo(node.key);
		if (cmp < 0)
			node.left = insert(node.left, k, v);
		else if (cmp > 0)
			node.right = insert(node.right, k, v);
		else
			node.val = v;

		if (isRed(node.right) && !isRed(node.left))
			node = rotateLeft(node);
		if (isRed(node.left) && isRed(node.left.left))
			node = rotateRight(node);
		if (isRed(node.left) && isRed(node.right))
			flipColors(node);
		return node;

	}

	public void insert(K k, V v) {
		root = insert(root, k, v);
		root.color = BLACK;
	}

	private Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private void flipColors(Node h) {
		h.color = RED;
		h.left.  color = BLACK;
		h.right.color = BLACK;
	}

	private boolean isRed(Node x) {
		if (x == null)
			return false;
		return x.color == RED;
	}

	private void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.print(node.key + " ");
		inorder(node.right);
	}

	public void inorder() {
		System.out.print("In-order : ");
		inorder(root);
		System.out.println("");
	}

	private int height(Node node) {
		if (node == null)
			return -1;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	public int height() {
		return height(root);
	}

	public K getRootKey() {
		return root.key;
	}

	public V getValue(Node node) {
		return node.val;
	}
}
