package jobsheet13.precobaan;

public interface PQueue<T> {
    boolean isEmpty();  // Mengembalikan true jika queue kosong, flase jika tidak
    T peek();           // Mengembalikan elemen di depan queue tanpa menghapusnya
    T pop();            // Menghapus dan mengembalikan elemen di depan queue
    void push(T item);  // Menyisipkan item di akhir queue
    int size();         // Menembalikan jumlah elemen di queue
}
