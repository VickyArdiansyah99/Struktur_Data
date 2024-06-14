package jobsheet08;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList<String> Dlist = new DoubleLinkedList<String>();
        System.out.println(Dlist.toString());
        Dlist.tambahNode_Akhir(new DNode<String>("ungu"));
        System.out.println("Tambah Node Akhir[List Kosong] : " + Dlist.toString());
        
        Dlist.tambahNode_Depan(new DNode<String>("merah"));
        System.out.println("Tambah Node di Depan : " + Dlist.toString());
        
        Dlist.tambahNode_Depan(new DNode<String>("ungu"));
        System.out.println("Tambah Node di Depan : " + Dlist.toString());
        
        Dlist.tambahNode_Akhir(new DNode<String>("kuning"));
        System.out.println("Tambah Node Akhir(Baca Maju) : " + Dlist.toString());
        System.out.println("Tambah Node Depan(Baca Mundur) : " + Dlist.toStringBack());
        
        Dlist.tambahNode_Sebelum(new DNode<String>("Coklat"), new DNode<String>("Merah"));
        System.out.println("Tambah Node Sebelum Target(Target Di Tengah List) : " + Dlist.toString());
        
        Dlist.tambahNode_Setelah(new DNode<String>("Coklat"), new DNode<String>("Kuning"));
        System.out.println("Tambah Node Sebelum Target(Target Di Akhir List) : " + Dlist.toString());
        
        Dlist.tambahNode_SebelumBacaMundur(new DNode<String>("pink"), new DNode<String>("Kuning"));
        System.out.println("Tambah Node Sebelum Target(Target Di Akhir List) : " + Dlist.toString());
        
        Dlist.tambahNode_SetelahBacaMundur(new DNode<String>("hijau"), new DNode<String>("pink"));
        System.out.println("Tambah Node Sebelum Target(Target Di Depan List) : " + Dlist.toString());
    }
}
