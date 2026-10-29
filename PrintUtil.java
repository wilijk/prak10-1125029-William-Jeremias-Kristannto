
import java.util.*;

interface Printable {
    String getPrintDetail();
}

class Mahasiswa implements Printable {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String getPrintDetail() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}

public class PrintUtil {
    public static <T> void printLіst(List<T> list) {
        for (T isi : list) {
            System.out.println(isi);
        }
    }

    public static <T> void printList(T[] list) {
        for (T isi : list) {
            System.out.println(isi);
        }
    }

    public static <T extends Printable> void printPrintableLіst(List<T> list) {
        for (T isi : list) {
            System.out.println(isi.getPrintDetail());
        }
    }

    public static <T extends Comparable<? super T>> void printSorted(List<T> list) {
        List<T> cList = new ArrayList<>(list);

        Collections.sort(cList);

        for (T isi : cList) {
            System.out.println(isi);
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] list) {
        T[] clist = list.clone();
        Arrays.sort(clist);
        for (T isi : clist) {
            System.out.println(isi);
        }
    }



    public static void main(String[] args) {

        //  System.out.println("---");
        // List<String> listNama = new ArrayList<>();
        // listNama.add("Andi");
        // listNama.add("Budi");
        // listNama.add("Cici");

        // PrintUtil.printLіst(listNama);

        // System.out.println("\n---");

        // Integer[] angkaArray = { 10, 20, 30, 40, 50 };

        // PrintUtil.printList(angkaArray);
        // System.out.println("\n---");

        // List<Mahasiswa> listMhs = new ArrayList<>();
        // listMhs.add(new Mahasiswa("kunti", "12345"));
        // PrintUtil.printPrintableLіst(listMhs);

        // System.out.println("\n---");


        BelajarPboList<Box<Integer>> myList = new BelajarPboList<>();
        myList.add(new Box<>(456));
        myList.add(new Box<>(789));
        myList.add(new Box<>(123));
        myList.add(new Box<>(634));
        myList.add(new Box<>(213));
        
        System.out.println("Output list ");
        myList.printList();

        System.out.println("Output list sorted: ");
        myList.printListSorted();
    }

}
