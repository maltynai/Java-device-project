import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter the number of devices to create (between 1 and 20): ");
        int numDevices = scanner.nextInt();

        Device[] devices = new Device[numDevices];

        int totalPrice = 0;
        int totalWeight = 0;

        for (int i = 0; i < numDevices; i++) {
            int deviceType = random.nextInt(3);

            String type;
            double price = random.nextDouble() * 1000.0; //random price between 0 and 10 000 USD
            double weight = random.nextDouble() * 2000.0;//random weight between 0 and 2000 grams


            if (deviceType == 0) {
                type = "SmartPhone";
                String[] brandOptions = {"IPhone", "Samsung", "Xiaomi", "Honor"};
                String[] colorOptions = {"red", "white", "black", "purple"};
                String color = colorOptions[random.nextInt(4)]; // Random color
                String brand = brandOptions[random.nextInt(4)]; // Random brand
                devices[i] = new SmartPhone(weight, price,type , color, brand);

            } else if (deviceType == 1) {
                type = "Laptop";
                String[] colorOptions = {"grey", "white", "black", "blue"};
                String color = colorOptions[random.nextInt(4)];
                double screenSize = random.nextDouble() * 6.0 + 3.0; // Random screen size between 3 and 9 inches
                devices[i] = new Laptop(weight, price, type,screenSize ,color);
            } else {
                type = "Tablet";
                String[] osOptions = {"Android", "IOS", "Windows"};
                String os = osOptions[random.nextInt(3)]; // Random operating system
                devices[i] = new Tablet( weight, price,type, os);
            }

            totalWeight += weight;
            totalPrice += price;


        }



        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");

        scanner.close();
    }




}