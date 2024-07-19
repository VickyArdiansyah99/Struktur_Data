package jobsheet13.latihan;

class Customer implements Comparable<Customer> {
    private String name;
    private int balance;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
