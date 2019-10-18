package Demo_05;

import java.util.LinkedList;

/*
 * 自定义的栈集合
 */
public class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}

	public void add(Object obj) {	//入栈
		link.addFirst(obj);
	}

	public Object get() {	//获取栈顶元素
		return link.removeFirst();
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
