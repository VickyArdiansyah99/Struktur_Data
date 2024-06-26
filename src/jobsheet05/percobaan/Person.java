package jobsheet05.percobaan;

public class Person implements Comparable {
    String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "[ name=" +  firstName + ", name=" + lastName + "]";
    }
    
    public int compareTo(Object obj) {
        Person emp = (Person) obj;
        int deptComp = firstName.compareTo(emp.getFirstName());
        return ((deptComp == 0 ) ? lastName.compareTo(emp.getLastName()): deptComp);
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person emp = (Person) obj;
        return firstName.equals(emp.getFirstName())
                && lastName.equals(emp.getLastName());
    }
}
