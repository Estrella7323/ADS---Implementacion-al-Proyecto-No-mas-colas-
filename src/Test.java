
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new ArrayQueue<String>(2);
		try {
		q.enqueue("eeeeeeeeeee");
		q.enqueue("aaaaaaaaa");
		q.enqueue("iiiiii");
		q.enqueue("uuuuuu");
		q.enqueue("eeeeee");
		q.enqueue("adasdad");
		q.enqueue("gsdgsg");
		q.enqueue("sdfsdgsdg");
		q.enqueue("aaaaaaaaaaaaaaaaaaaaaaa");
		
		while(!q.isEmpty())
			System.out.println("Elemento :"+ q.dequeue());
	}
	catch(ExceptionIsEmpty x) {
		System.out.println(x.getMessage());
		
	}
	}
		
}
