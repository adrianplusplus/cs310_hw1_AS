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
		return false;
	}

	@Override
	public void emptyQueue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enQ(E obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public E deQ() {
		E temp = this.deQStack.pop();
		// if is empty, pop all elements from enq and push to deq
		if (temp == null) {
			while (!this.enQStack.isEmpty()) {
				this.deQStack.push(this.enQStack.pop());
			}
			temp = this.deQStack.pop();
		}

		// return poped
		return temp;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
