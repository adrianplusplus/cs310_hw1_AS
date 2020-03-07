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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
