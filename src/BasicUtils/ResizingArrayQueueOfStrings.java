package BasicUtils;

import java.util.Iterator;

public class ResizingArrayQueueOfStrings implements Iterable<String> {
	int N = 0;
	int head = 0;
	int tail = -1;
	String [] a = new String[1];
	
	public boolean isEmpty() { return N == 0; }
	public int size()        { return N; }
	public int arraySize()   { return a.length; }
	
	public void push(String item) {
		if(N++ == a.length) { resize(2*a.length); }
		tail = (tail + 1) % a.length;
		a[tail] = item;
	}
	
	public String pop() {
		String tmp = a[head];
		a[head] = null;
		head = (head + 1) % a.length;
		if(--N == a.length / 4) { 
			resize(a.length/2);
			head = 0;
			tail = N - 1;
		}
		return tmp;
	}
	
	private void resize(int max) {
		String [] temp = new String[max];
		for(int i = 0; i < N; i++ ) {
			temp[i] = a[(head + i) % a.length];
		}
		a = temp;
	}
	
	public Iterator<String> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<String> {
		int i = 0;
		public boolean hasNext() {
			return i < N;
		}
		
		public String next() {
			return a[(head + i++) % a.length];
		}
		
		public void remove() {
		}
	}
}