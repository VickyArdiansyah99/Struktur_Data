package jobsheet05.percobaan;

import java.util.Comparator;

class Employee {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AgeComparator implements Comparator {
    public int compare(Object emp1, Object emp2) {
        int emp1Age = ((Employee) emp1).getAge();
        int emp2Age = ((Employee) emp2).getAge();
        if (emp1Age > emp2Age) {
            return 1;
        } else if (emp1Age < emp2Age) {
            return -1;
        } else {
            return 0;
        }
    }    
}

class NameComparator implements Comparator {
    public int compare(Object emp1, Object emp2) {
        // parameter are of type object, so we have to downcast it to Employee objects
        String emp1name = ((Employee) emp1).getName();
        String emp2name = ((Employee) emp2).getName();
        // uses compareTo method of String class to compate names of the employee
        return emp1name.compareTo(emp2name);
    }    
}