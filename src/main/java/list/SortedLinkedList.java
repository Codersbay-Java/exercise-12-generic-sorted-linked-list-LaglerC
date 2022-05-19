package list;

public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {

	private Node<S> head;
	private int size;

	@Override
	public void insert(S element) {

		Node<S> nn = new Node<>(element);

		if (isEmpty()) {
			head = nn;
		} else {
			Node<S> current = head;

			while (current.getNext() != null) {

				if ((current.getValue().compareTo(nn.getValue())) < 0) {

					if (current == head) {
						current.setNext(nn);
						nn = current;
					}
				}
				size++;
			}
		}
	}

	@Override
	public boolean delete(int index) {

		Node<S> current = head;
		int counter = 0;

		if (isEmpty()) {
			return false;
		} else {

			while (current.getNext() != null) {
				if (index == counter) {

					current.setValue(null);
					current = null;
				}
				current = current.getNext();
				counter++;
			}
		}
		size--;
		return true;
	}

	@Override
	public S get(int index) {

		Node<S> current = head;
		int counter = 0;

		while (current.getNext() != null) {
			if (index == counter) {
				return current.getValue();
			}
			current = current.getNext();
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		String string = null;

		Node<S> current = head;
		while (current != null) {

			string = string + " / " + current.getValue().toString() + " / ";
			if (current.getNext() != null) {
				string = string + "-->";
			}

			current = current.getNext();
		}
		return string;
	}

}