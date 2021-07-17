
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
    
        private int linearProbing(int buildHash, int key) {

        int posInit = buildHash;

        do {
            if(table.get(buildHash).marca == 0)
                return buildHash;		//se encontro posicion vacia

            if(table.get(buildHash).marca    == 1 && table.get(buildHash).reg.getKey() == key)
                return -2;

            buildHash = (buildHash + 1) % m; // para 1

        } while(buildHash != posInit);

        return -1;
    }

    public void insert(int key, String reg) {
        int buildHash = functionHash(key); // 0
        buildHash = linearProbing(buildHash, key);
        if (buildHash == -1) {
            System.out.println("Key table hash is full...");
            return;
        }
        else if(buildHash == -2) {
            System.out.println("key is duplicated");
            return;
        }
        else {
            Element aux = new Element(1,new RegisterHash<E>(key, (E) reg));
            table.set(buildHash, aux);
        }
    }
}    
