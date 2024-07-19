package jobsheet13.precobaan;

import java.util.Comparator;

enum ProductQuality {
    High, Medium, Low
}
class Product implements  Comparable<Product> {
    String name;
    ProductQuality priority;
    public Product(String str, ProductQuality pri) {
        name = str;
        priority = pri;
    }
    public int compareTo(Product msg2) {
        return priority.compareTo(msg2.priority);
    }

    ProductQuality getQuality() {
        return priority;
    }

    @Override
    public  String toString() {
        return name + " (" + priority + ")";
    }
}
class MessageComparator implements Comparator<Product> {
    public int compare(Product msg1, Product msg2) {
        return msg2.priority.compareTo(msg1.priority);
    }
}
class PrimaComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
