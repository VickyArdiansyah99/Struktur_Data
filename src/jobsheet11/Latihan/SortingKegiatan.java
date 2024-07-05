package jobsheet11.Latihan;

import java.util.ArrayList;
import java.util.List;

class Kegiatan {
    String nama;
    String waktuMulai;
    String waktuSelesai;
    int durasi; // dalam menit

    Kegiatan(String nama, String waktuMulai, String waktuSelesai) {
        this.nama = nama;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.durasi = hitungDurasi(waktuMulai, waktuSelesai);
    }

    private int hitungDurasi(String waktuMulai, String waktuSelesai) {
        int mulai = konversiKeMenit(waktuMulai);
        int selesai = konversiKeMenit(waktuSelesai);
        return selesai - mulai;
    }

    private int konversiKeMenit(String waktu) {
        String[] bagian = waktu.split(":");
        int jam = Integer.parseInt(bagian[0]);
        int menit = Integer.parseInt(bagian[1]);
        return jam * 60 + menit;
    }
}

public class SortingKegiatan {
    public static void main(String[] args) {
        List<Kegiatan> kegiatanList = new ArrayList<>();
        kegiatanList.add(new Kegiatan("Bangun Tidur", "06:00", "06:30"));
        kegiatanList.add(new Kegiatan("Sholat Dhuha", "06:30", "06:45"));
        kegiatanList.add(new Kegiatan("Sarapan", "06:45", "07:30"));
        kegiatanList.add(new Kegiatan("Ngantri Mandi", "07:30", "08:30"));
        kegiatanList.add(new Kegiatan("Ngantri Mandi", "08:30", "09:00"));
        kegiatanList.add(new Kegiatan("Kuliah Pagi", "09:00", "12:00"));
        kegiatanList.add(new Kegiatan("Sholat Dhuhr", "12:00", "12:15"));
        kegiatanList.add(new Kegiatan("Makan Siang", "12:15", "13:00"));
        kegiatanList.add(new Kegiatan("Studi Mandiri 1", "13:30", "17:00"));
        kegiatanList.add(new Kegiatan("Refreshing", "17:00", "18:00"));
        kegiatanList.add(new Kegiatan("Sholat Maghrib", "18:00", "18:10"));
        kegiatanList.add(new Kegiatan("Makan Malam", "18:10", "19:00"));
        kegiatanList.add(new Kegiatan("Sholat Isya", "19:00", "19:15"));
        kegiatanList.add(new Kegiatan("Studi Mandiri 2", "19:15", "24:00"));

        System.out.println("Urutan kegiatan sebelum di sorting:");
        printSortedKegiatanList(kegiatanList);

        insertionSortByDuration(kegiatanList);

        System.out.println("\na: Urutan kegiatan berdasarkan rentang waktu yang paling lama");
        printSortedKegiatanList(kegiatanList);

        System.out.println("\nb: Kegiatan yang memiliki rentang waktu terpanjang");
        System.out.println("Kegiatan dengan rentang waktu terpanjang: " + kegiatanList.get(0).nama);

        System.out.println("\nc: Kegiatan yang memiliki rentang waktu tersingkat");
        System.out.println("Kegiatan dengan rentang waktu tersingkat: " + kegiatanList.get(kegiatanList.size() - 1).nama);
    }

    public static void insertionSortByDuration(List<Kegiatan> list) {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            Kegiatan key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).durasi < key.durasi) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void printSortedKegiatanList(List<Kegiatan> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).nama);
        }
    }
}
