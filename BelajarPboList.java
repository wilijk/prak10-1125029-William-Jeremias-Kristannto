import java.util.*;

class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T isi;

    public Box(T isi) {
        this.isi = isi;
    }

    public T get() {
        return isi;
    }

    public void set(T isi) {
        this.isi = isi;
    }

    @Override
    public int compareTo(Box<T> object) {
        return this.isi.compareTo(object.get());
    }

    @Override
    public String toString() {
        return isi.toString();
    }
}

class BelajarPboList<T extends Comparable<T>> extends ArrayList<T> {

    public void printList() {

        PrintUtil.printLіst(this);
    }

    public void printListSorted() {
        PrintUtil.printSorted(this);
    }
}