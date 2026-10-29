import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Main {
    public static class Car {
        private String model;
        private String brand;
        private int year;
        private double price;
        private String color;
        private int quantity;
        public Car (String model, String brand, int year, double price, String color, int quantity){
            this.model = model;
            this.brand = brand;
            this.year = year;
            this.price = price;
            this.color = color;
            this.quantity = quantity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public void delivery(){
            this.quantity = this.quantity + 1;
        }
        public void sell(){
            this.quantity = this.quantity - 1;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }
    public static void main(String[] args) {
        Car Toyota = new Car("Corolla", "Toyota", 1980,300.5,"Red",4);
        System.out.println(Toyota.toString());
        Toyota.sell();
        System.out.println(Toyota.getBrand());
        System.out.println(Toyota.getModel());
        System.out.println(Toyota.getYear());
        System.out.println(Toyota.getPrice());
        System.out.println(Toyota.getColor());
        System.out.println(Toyota.getQuantity());
        Toyota.setPrice(400.2);
        Toyota.setColor("Black");
        System.out.println(Toyota);

    }
}