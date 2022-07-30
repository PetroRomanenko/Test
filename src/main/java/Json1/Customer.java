package Json1;

public class Customer {
    private String name;
    private String custID;
    private float overdue;
    private int bucket;

    public Customer(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Json1.Customer{" +
                "name='" + name + '\'' +
                ", custID='" + custID + '\'' +
                ", overdue=" + overdue +
                ", bucket=" + bucket +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public float getOverdue() {
        return overdue;
    }

    public void setOverdue(float overdue) {
        this.overdue = overdue;
    }

    public int getBucket() {
        return bucket;
    }

    public void setBucket(int bucket) {
        this.bucket = bucket;
    }

    public Customer() {
    }
}
