package jobsheet09.percobaan;

import java.util.Iterator;

public class TestALStack {
    public static void main(String[] args) {
        ALStack<String> sa = new ALStack<String>();
        
        sa.push("Pink");
        sa.push("Purple");
        sa.push("Red");
        System.out.println("Size Stack : " + sa.size());
        sa.pop();
        
        System.out.println("Peek Stack : " + sa.peek());
        System.out.println("Size Stack : " + sa.size());
        
        Iterator it=sa.iterator();
            
        while(it.hasNext()){
            System.out.println("Iterator Value : " + it.next());
        }
    }
}
