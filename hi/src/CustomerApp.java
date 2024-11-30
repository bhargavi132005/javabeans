import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;




public class CustomerApp {
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add some customers to the list
        customers.add(new Customer("John", "Doe", 1001, 1500.75));
        customers.add(new Customer("Jane", "Smith", 1002, 500.25));
        customers.add(new Customer("Mary", "Johnson", 1003, 2200.00));
        customers.add(new Customer("John", "Smith", 1004, 1800.00));
        customers.add(new Customer("Alice", "Brown", 1005, 300.50));

        // Sort the list using the CustomerComparator
        Collections.sort(customers, new CustomerComparator());

        // Print the sorted list of customers
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}