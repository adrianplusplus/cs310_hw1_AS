package Container;

import Interface.StackSpecs;

public class LLStack<E> implements StackSpecs<E> {
	private Node<E> top; // The first node
	private int stackSize; // The size of the stack

	public LLStack() {
		top = new Node<E>(null);
		stackSize = 0;
	}

	@Override
	public boolean isEmpty() {
		return stackSize == 0;
	}

	@Override
	public void emptyStack() {
		this.top = null;
		this.stackSize = 0;
	}

	@Override
	public void push(E obj) {
		// create new node and allocate memory
		Node<E> pushNode = new Node<E>(obj);

		if (this.isEmpty()) {
			this.top = pushNode;
		} else {
			// put top reference into link
			pushNode.setNextNode(this.top);

			// update top reference

		}

		this.top = pushNode;
		stackSize++;
	}

	@Override
	public E pop() {
		// check for stack underflow
		if (this.top == null) {
			System.out.print("\nStack Underflow");
			return null;
		}

		Node<E> popNode = this.top;

		// update the top pointer to point to the next node
		this.top = this.top.getNextNode();

		this.stackSize--;
		return popNode.getData();
	}

	@Override
	public E peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.getData();
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}

	@Override
	public String toString() {
		Node<E> current = this.top;
		String str = "";
		if (this.isEmpty())
			return str;
		while (current != null) {
			str += String.format(current.getData().toString()) + '\n';
			current = current.getNextNode();
		}
		return str;
	}

	@Override
	public int size() {
		return this.stackSize;
	}

}
