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
public class MyJSONMap implements JsonMapInterface {
    private JSONObject jsonObject;
    public MyJSONMap() {
        this.jsonObject = new JSONObject();
    }
    @Override
    public void put(String key, Object value) {
        jsonObject.put(key, value);
    }
    @Override
    public Object get(String key) {
        return jsonObject.get(key);
    }
    @Override
    public void remove(String key) {
        jsonObject.remove(key);
    }
    @Override
    public int size() {
        return jsonObject.length();
    }
    @Override
    public boolean isEmpty() {
        return jsonObject.length() == 0;
    }
    @Override
    public String toString() {
        return jsonObject.toString();
    }
    
    public static void main(String[] args) {
        MyJSONMap jsonMap = new MyJSONMap();
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
