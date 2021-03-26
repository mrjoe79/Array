package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerkim = new VIPCustomer();
        customerkim.setCustomerID(10020);
        customerkim.setCustomerName("김유신");
        customerkim.bonusPoint = 10000;
        System.out.println(customerkim.showCustomerInfo());
    }
}
