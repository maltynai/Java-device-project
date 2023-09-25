public class Laptop extends Device{
    private double screenSize;
    private String color;


    public Laptop( double weight, double price, String type, double screensize, String color) {
        super(type, price,weight );
        this.screenSize = screensize;
        this.color = color;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
