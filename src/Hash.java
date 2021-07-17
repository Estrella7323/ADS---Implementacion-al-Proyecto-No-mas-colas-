
import java.util.ArrayList;

public class Hash<E extends Comparable<E>> {

    protected ArrayList<Element> table = new ArrayList<Element>();
    protected int m; //mod

    protected class Element{
        int marca;
        RegisterHash<E> reg;

        public Element(int marca, RegisterHash<E> reg) {
            this.marca = marca;
            this.reg = reg;
        }
    }

    public Hash(int mod) {
        m = mod;

        for (int i = 0; i < mod; i++) {
            table.add(new Element(0, null));
        }
    }
    private int functionHash(int key) {
        return key % m;
    }
}    
