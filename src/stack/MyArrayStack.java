package stack;

public class MyArrayStack<E> implements Stack<E> {

	private E[] datas;
	private int capacity = 100;
	private int top = -1;

	public MyArrayStack() {
		datas = (E[]) new Object[capacity];
	}


	@Override
	public void push(E e) {
		if(top == capacity-1) {
			E[] temp = (E[]) new Object[capacity*2];
			System.arraycopy(datas, 0, temp, 0, capacity);
			datas = temp;
		}
		datas[++top] = e;
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		return datas[top--];
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}
}
