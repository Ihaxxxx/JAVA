public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda","Civiv",10000);

        car.setColor("Blue");
        car.setPrice(8000);

        System.out.println(car.getColor() + " " + car.getModel() +" " + car.getPrice());
    }
}