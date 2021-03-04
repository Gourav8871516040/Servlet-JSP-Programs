
package MyClasses;


public class Customer {
private String name,cid;
private double mob;

    public Customer(String name, String cid, double mob) {
        this.name = name;
        this.cid = cid;
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", cid=" + cid + ", mob=" + mob + '}';
    }

    public String getCid() {
        return cid;
    }

    public double getMob() {
        return mob;
    }
 
}
