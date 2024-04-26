/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
import org.json.JSONObject;
public class JSONMap {
    private JSONObject jsonObject;
    public JSONMap() {
        this.jsonObject = new JSONObject();
    }
    // Method untuk menambahkan data ke dalam JSON Map
    public void put(String key, Object value) {
        jsonObject.put(key, value);
    }
    // Method untuk menambahkan nilai berdasarkan kunci (key)
    public Object get(String key) {
        return jsonObject.get(key);
    }
    // Method untuk menghapus data berdasarkan kunci (key)
    public void remove(String key) {
        jsonObject.remove(key);
    }
    // Method untuk mendapatkan jumlah eleman dalam JSON Map
    public int size() {
        return jsonObject.length();
    }
    // Method untuk mengecek apakah JSON Map kosong
    public boolean isEmpty() {
        return jsonObject.length() == 0;
    }
    // Method untuk menampilkan isi JSON Map sebagai string
    public String toString() {
        return jsonObject.toString();
    }
    
    public static void main(String[] args) {
        JSONMap jsonMap = new JSONMap();
        // Menambahkan data ke JSON Map
        jsonMap.put("name", "Jonh");
        jsonMap.put("age", 30);
        jsonMap.put("isStudent", false);
        // Mendapatkan nilai berdasarkan kunci (key)
        System.out.println("Name: " + jsonMap.get("name"));
        System.out.println("Age: " + jsonMap.get("age"));
        System.out.println("Is Student? " + jsonMap.get("isStudent"));
        // menghapus data berdasarkan kunci (key)
        jsonMap.remove("age");
        // Menampilkan isi JSON Map
        System.out.println("JSON Map: " + jsonMap.toString());
        // Menampilkan jumlah elemen dalam JSON Map
        System.out.println("Size: " + jsonMap.size());
        System.out.println("Is Empty? " + jsonMap.isEmpty());
    }
}
