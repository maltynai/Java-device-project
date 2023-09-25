public class SmartPhone extends Device{
    private String brand;
    private String color;


    public SmartPhone(double price, double weight, String type, String brand, String color){
        super( type, weight,price);
        this.brand = brand;
        this.color = color;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
