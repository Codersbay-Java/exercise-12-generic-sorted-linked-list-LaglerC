package list;

public class Node<S> {

	private S value;
	private Node<S> next;
	private Node<S> prev;

	public Node(S value) {
		this.value = value;
	}

	public S getValue() {
		return value;
	}

	public void setValue(S value) {
		this.value = value;
	}

	public Node<S> getNext() {
		return next;
	}

	public void setNext(Node<S> next) {
		this.next = next;
	}

	public Node<S> getPrev() {
		return prev;
	}

	public void setPrev(Node<S> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "value=" + value;
	}
}
