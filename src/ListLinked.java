
public class ListLinked <T>{
	private Node<T> first;
	private int count;
	
	public int length() {
		return this.count;
	}
	
	public ListLinked() {
		this.first = null;
	}	
	boolean isEmpty() {
		return this.first ==null;
	}

	public int search(T data){
		Node<T> nodo = this.first;
		int pos = 0;
		while (nodo != null && !nodo.getData().equals(data)) {
			nodo = nodo.getNext();
			pos++;
		}
		if(nodo == null)return -1;
		return pos;
	}
	public void removeNode(T data){
		int pos = this.search(data);
		if ( pos !=-1) {
			for(int i = pos; i<this.length(); i++)
				this.count = this.count+1;
			this.count--;
			
		}
		else
			System.out.println("Item not found....");
	}
	public T searchData(T data){
		Node<T> nodo= this.first;
		while(nodo!=null && !nodo.getData().equals(data))
			nodo=nodo.getNext();
		if(nodo != null)
			return nodo.getData();
		return null;
	}


	public void insertFirst(T data) {
		this.first= new Node<T>(data,this.first);
	}
	public void getNext()
	{
		Node<T> nodo= this.first;
		nodo=nodo.getNext();
	}

	public String toString() {
		String str="";
		Node<T> aux = this.first;
		for(int i=0; aux!= null; aux= aux.getNext(),i++)
		str += aux.getData();
		/*for(int i=0; aux!= null; aux= aux.getNext(),i++)
			str += "["+i+"] = "+ aux.data+ "\n";*/
		return str;
	}
	


	
}
