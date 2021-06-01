
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedQueue<String>();
		/*Queue<String> g = new ArrayQueue<String>(2);
		Queue<String> a = new ArrayQueue<String>(2);
		Queue<String> b = new ArrayQueue<String>(2);*/
		try {
		q.enqueue("eeeeeeeeeee");
		q.enqueue("aaaaaaaaa");
		q.enqueue("3");
		q.enqueue("4");
		q.enqueue("5");
		//a.enqueue("hola");
		
		q.back();
		System.out.println("\n");
		q.front();
		
		//System.out.println(q.isEmpty());
		
		/*while(!q.isEmpty())
			System.out.println("Elemento :"+ q.dequeue());*/
		
		/*System.out.println("otro");
		System.out.println(g.isEmpty());
		System.out.println(a.isEmpty());*/
		
	}
	catch(ExceptionIsEmpty x) {
		System.out.println(x.getMessage());
		
	}
	}
		
}
