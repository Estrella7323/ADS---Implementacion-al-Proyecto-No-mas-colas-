
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
		if (this.front==null){
			return true;
		}
		return false;
	}

	@Override
	public E front() throws ExceptionIsEmpty {
		if (this.front==null){
			System.out.print("no hay valor inicial");
			return null;
		}
		Node<E> aux= this.front;
		
		/*while (aux.getNext().getNext()!=null){
			aux=aux.getNext();
		}*/
		aux.setNext(null);
		System.out.print(aux.getData());
		return null;
		
		
	}

	@Override
	public E back() throws ExceptionIsEmpty {
		if (this.front==null){
			System.out.print("esta vacio");
			return null;
		}
		Node<E> res= this.back;
		Node<E> aux=this.front;
		
		while (aux.getNext().getNext()!=null){
			aux=aux.getNext();
		}
		aux.setNext(null);
		System.out.print(res.getData());
		return null;
			
		
	}
	public String toString() {
        String str ="";
        Node<E> aux = this.front;
        for(int i = 0;aux != null;aux = aux.getNext(),i++)
            str += aux.getData()+"\n";
        return str;
    }

}
