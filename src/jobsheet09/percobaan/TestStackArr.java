package jobsheet09.percobaan;

public class TestStackArr {
    public static void main(String[] args) {
        StackArr<String> sa = new StackArr<String>(10);
        
        sa.push("Pink");
        sa.push("Purple");
        sa.push("Red");
        System.out.println("Push Stack : " + sa.toString());
        System.out.println("Size Stack : " + sa.size());
        sa.pop();
        System.out.println("Pop Stack : " + sa.toString());
        System.out.println("Peek Stack : " + sa.peek());
        System.out.println("Size Stack : " + sa.size());
    }
}
