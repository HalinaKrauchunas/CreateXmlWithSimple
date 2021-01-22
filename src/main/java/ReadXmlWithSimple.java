import org.simpleframework.xml.*;
import org.simpleframework.xml.convert.*;
import org.simpleframework.xml.core.*;
import org.simpleframework.xml.transform.*;

import java.io.*;
import java.text.*;
import java.util.*;

public class ReadXmlWithSimple {
    public static final String XMLDATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static void main(String[] args) throws Exception {

        DateFormat dateFormat = new SimpleDateFormat(XMLDATEFORMAT);
        RegistryMatcher m = new RegistryMatcher();
        m.bind(Date.class, new DateFormatTransformer(dateFormat));

        Serializer serializer = new Persister(m);
        File source = new File("./src/main/resources/customers.xml");

        Customers customers = serializer.read(Customers.class, source);
        List<Customer> data = customers.getCustomers();

        for (Customer customer : data){
            System.out.println(customer);
        }

    }
}
