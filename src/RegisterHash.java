
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

    public boolean equals(Object o) {
        if (o instanceof RegisterHash) {
            RegisterHash<E> r = (RegisterHash<E>)o;
            return r.key == this.key;
        }
        return false;
    }

    public int getKey( ) {
        return this.key;
    }

    public String toString() {
        return this.key+":"+this.value.toString();
    }
}
