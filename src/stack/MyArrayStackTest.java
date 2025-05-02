package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MyArrayStackTest {

	@Test
	public void 배열_스택_테스트() {
		Stack<Integer> stack = new MyArrayStack<>();

		stack.push(30);
		stack.push(3);
		stack.push(10);
		stack.push(60);

		assertFalse(stack.isEmpty());
		assertEquals(stack.size(), 4);
		assertEquals(stack.pop(), 60);
		assertEquals(stack.pop(), 10);
		assertEquals(stack.pop(), 3);
		assertEquals(stack.pop(), 30);
		assertEquals(stack.pop(), null);
		assertEquals(stack.pop(), null);
		assertEquals(stack.size(), 0);
	}
}