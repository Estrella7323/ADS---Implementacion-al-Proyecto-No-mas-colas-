package grafos;
public class Test 
{
    public static void main(String[] args) 
    {
        GraphLink<Integer> g2=new GraphLink<Integer>();
        g2.insertVertex(1);
        g2.insertVertex(2);
        g2.insertVertex(3);
        g2.insertVertex(7);
        g2.insertVertex(8);
        g2.insertVertex(6);
        g2.insertEdge(2,6);
        g2.insertEdge(7,8);
        g2.insertEdge(1,3);
        g2.insertEdge(1,2);
        g2.insertEdge(3,7);
        g2.insertEdge(2,7);
        g2.insertEdge(2,6);
        System.out.println(g2);
        g2.BFS(1);
    }

}