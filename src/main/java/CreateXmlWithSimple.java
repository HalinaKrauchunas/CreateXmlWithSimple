import org.simpleframework.xml.*;
import org.simpleframework.xml.core.*;

import java.io.*;
import java.util.*;

public class CreateXmlWithSimple {

    public static void main(String[] args) throws Exception {

        List<Customer> data = DataProvider.getData(DataProvider.SMALL);

        Customers customers = new Customers();
        customers.setCustomers(data);

        Serializer serializer = new Persister();
        StringWriter sw = new StringWriter();
        serializer.write(customers, sw);

        System.out.println(sw.toString());
    }
}
