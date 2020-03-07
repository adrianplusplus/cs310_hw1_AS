package Container;

import Interface.QueueSpecs;

public class StackQ<E> implements QueueSpecs<E> {

	private LLStack<E> enQStack;
	private LLStack<E> deQStack;

	public StackQ() {
		this.enQStack = new LLStack<E>();
		this.deQStack = new LLStack<E>();
	}

	@Override
	public boolean isEmpty() {
		return this.enQStack.isEmpty() && this.deQStack.isEmpty();
	}

	@Override
	public void emptyQueue() {
		this.enQStack.emptyStack();
		this.deQStack.emptyStack();
	}

	@Override
	public void enQ(E obj) {
		this.enQStack.push(obj);

	}

	@Override
	public E deQ() {
		// if is empty, pop all elements from enq and push to deq
		if (this.deQStack.isEmpty()) {
			while (!this.enQStack.isEmpty()) {
				this.deQStack.push(this.enQStack.pop());
			}
		}

		return this.deQStack.pop();
	}

	@Override
	public E peek() {
		if (this.deQStack.isEmpty()) {
			while (!this.enQStack.isEmpty()) {
				this.deQStack.push(this.enQStack.pop());
			}
		}
		return this.deQStack.peek();
	}

	@Override
	public String toString() {
		String str = "Content of deQStack below\n" + this.deQStack.toString();

		str += "\nContent of enQStack below\n" + this.enQStack.toString();

		return str;
	}

	@Override
	public int size() {
		return this.deQStack.size() + this.enQStack.size();
	}

}
