package neel;

import java.util.*;;

public class ArrayDequeExample {

	public static void main(String args[])
	{
		Deque<String>  deque=new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Sah");
		deque.add("Ranjan");
		for(String str: deque)
		{
			System.out.println(str);
		}
		String value =deque.peek();
		System.out.println(deque);
		System.out.println(value);
		value=deque.pop();
		System.out.println(deque);
		System.out.println(value);
		value=deque.poll();
		System.out.println(deque);
		System.out.println(value);
		deque.offer("rajnish");
		System.out.println(deque);
		deque.offerFirst("raj");
		System.out.println(deque);
		deque.offerLast("Vardhan");
		System.out.println(deque);
	}
	
}
