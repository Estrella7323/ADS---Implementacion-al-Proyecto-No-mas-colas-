

public class GraphLink <E> {
	protected ListLinked<Vertex<E>>listVertex;

	public GraphLink() {
		listVertex = new ListLinked<Vertex<E>>();
	}
	
	public void insertVertex(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		if(listVertex.search(nuevo) != -1) {
			System.out.println("vertex already exits");
			return;
		}
		listVertex.insertFirst(nuevo);
	}
	
	public void insertEdge(E verOri, E verDes) {
		Vertex<E> rOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> rDes = listVertex.searchData(new Vertex<E>(verDes));
		
		if(rOri == null || rDes==null) {
			System.out.println("alguan vertices(org,des) no existe");
			return;
			
		}
		if(rOri.listAdj.search(new Edge<E>(rDes)) != -1) {
			System.out.println("arista ya existe el grafo");
			return;
		}
		rOri.listAdj.insertFirst(new Edge<E>(rDes));
		rDes.listAdj.insertFirst(new Edge<E>(rOri));
	}
	public void insertEdgeWeight(E verOri, E verDes,int vpeso) {
		Vertex<E> rOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> rDes = listVertex.searchData(new Vertex<E>(verDes));
		if(rOri == null || rDes==null) {
			System.out.println("alguan vertices(org,des) no existe");
			return;	
		}
		if(rOri.listAdj.search(new Edge<E>(rDes)) != -1) {
			System.out.println("arista ya existe el grafo");
			return;
		}
		rOri.listAdj.insertFirst(new Edge<E>(rDes,vpeso));
		
		rDes.listAdj.insertFirst(new Edge<E>(rOri,vpeso));
	}
	public void removeVertex(E data) throws ItemNoFound {
		Vertex<E> elimi2 = listVertex.searchData(new Vertex<E>(data));
		Vertex<E> elimi = new Vertex<E>(data);
		//Vertex<E> duda = new Vertex<E>(data);
		
		listVertex.removeNode(elimi);
		listVertex.removeNode(elimi2);
		listVertex.searchData(new Vertex<E>(data));
		elimi=null;
		elimi2=null;
		Vertex<E> aux = listVertex.searchData(new Vertex<E>(data));
		aux=null;
		for(int i = 0; i<listVertex.length(); i++)
			elimi=null;
			
		
		
		
		/*for (int i=0; duda != rOri ;i++)
		if(rOri.listAdj.search(new Edge<E>(rOri)) != -1) {
			System.out.println("arista ya existe el grafo");
			return;
		}
		if (listVertex.search(nuevo) != listVertex.search(duda)) {
			System.out.println("vertex already exits");
			return;
		}
		listVertex.insertFirst(nuevo);*/
	}
	public void bfs (E data) {
		ListLinked<Vertex<E>>listdfs;
		listdfs = new ListLinked<Vertex<E>>();
		Vertex<E> dato = new Vertex<E>(data);
		/*for(int i=0; dato!= null; dato=dato.getNext(),i++)
			listdfs.insertFirst(dato);
			if(dato==searchVertex(dato)) {
				dato=dato.getNext();
			}*/
            
	}
	public boolean searchVertex(E data) {
		Vertex<E> busca = new Vertex<E>(data);
		if(listVertex.search(busca) != -1) {
			//System.out.println("El vertice "+busca+"existe");
			return true;
		}else {
			//System.out.println("El vertice "+busca+"no existe");
			return false;
		}
		
	}
	public boolean searchEdge(E verOri, E verDes) {
		Vertex<E> rOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> rDes = listVertex.searchData(new Vertex<E>(verDes));
		
		if(rOri == null || rDes==null) {
			return false;
			
		}else {
			if(rOri.listAdj.search(new Edge<E>(rDes)) != -1) {
				return true;
			}else {
				return false;
			}
		}
	}
	public String toString(){
		return this.listVertex.toString();
	}
}
