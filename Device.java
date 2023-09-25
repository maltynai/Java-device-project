public class Device {
    protected String type;
    protected double price;
    protected double weight;

    public Device(String type, double price, double weight) {
        this.price = price;
        this.type = type;
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}