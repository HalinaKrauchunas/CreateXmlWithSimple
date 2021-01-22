import org.simpleframework.xml.*;

import java.util.*;

@Root(name = "customers")
public class Customers {
    @ElementList(inline = true)
    private List<Customer> customers;

    public List<Customer> getCustomers() {

        return customers;
    }

    public void setCustomers(List<Customer> customers) {

        this.customers = customers;
    }
}
