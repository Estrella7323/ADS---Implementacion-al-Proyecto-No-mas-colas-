
public class RegisterHash<E> implements Comparable<RegisterHash<E>> {
    protected int key;
    protected E value;
    public RegisterHash(int key, E value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(RegisterHash<E> r) {

        return this.key - r.key;
    }

    public int getKey( ) {
        return this.key;
    }

    public String toString() {
        return this.key+" :\t"+this.value.toString();
    }
}
