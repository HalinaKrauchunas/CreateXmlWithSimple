import org.simpleframework.xml.*;

import java.math.*;
import java.text.*;
import java.util.*;

@Root(name = "customer")
public class Customer {
    @Attribute
    private int id;
    @Element
    private String name;
    @Element
    private String phone;
    @Element(data = true)
    private String about;
    @Element
    private int age;
    @Element
    private BigDecimal balance;
    @Element
    private boolean active;
    @Element
    private Date joined;

    //data item names
    public static final String
        ID = "id",
        NAME = "name",
        PHONE = "phone",
        ABOUT = "about",
        AGE = "age",
        BALANCE = "balance",
        ACTIVE = "active",
        JOINED = "joined";

    public Customer() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getAbout() {

        return about;
    }

    public void setAbout(String about) {

        this.about = about;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public BigDecimal getBalance() {

        return balance;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;
    }

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }

    public Date getJoined() {

        return joined;
    }

    public void setJoined(Date joined) {

        this.joined = joined;
    }

    @Override
    public String toString() {

        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        return this.id + ". " + this.name + " joined " + df.format(this.joined);
    }
}
