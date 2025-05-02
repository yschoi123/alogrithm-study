package stack;

public interface Stack<E> {

	void push(E e);
	E pop();
	int size();
	boolean isEmpty();
}
