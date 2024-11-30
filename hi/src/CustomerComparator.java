import java.util.Comparator;
public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        // Compare First Name
        int result = c1.getFirstName().compareTo(c2.getFirstName());
        if (result != 0) return result;

        // Compare Last Name
        result = c1.getLastName().compareTo(c2.getLastName());
        if (result != 0) return result;

        // Compare ID
        result = Integer.compare(c1.getId(), c2.getId());
        if (result != 0) return result;

        // Compare Balance
        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}