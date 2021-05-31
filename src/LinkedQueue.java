
public class LinkedQueue<E> implements Queue<E> {
	
	private Node<E> front;
	private Node<E> back;
	
	public LinkedQueue() {
		this.front = null;
		this.back = null;
	}
	
	public void enqueue(E x) {
		// TODO Auto-generated method stub
		Node<E> nuevo = new Node<E>(x);
			if(this.isEmpty()) 
				this.front = nuevo;
			else 
				this.back.setNext(nuevo);
			this.back = nuevo;		
		
	}
	public E dequeue() {
		// TODO Auto-generated method stub
		if (this.isEmpty())
		return null;
		return null;
	}
	public boolean IsFull() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E front() throws ExceptionIsEmpty {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E back() throws ExceptionIsEmpty {
		// TODO Auto-generated method stub
		return null;
	}

}
