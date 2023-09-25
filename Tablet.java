public class Tablet extends Device {

    private String os;


    public Tablet( double weight, double price, String type,String os) {
        super(type, weight,price );
        this.os = os;

    }


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}