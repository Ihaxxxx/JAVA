public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car("Mustang","red");
//        Car car2 = new Car("Honda","Black");
//        Car car3 = new Car("Sportage","white");

//        Car[] cars = {car1,car2,car3};

        Car[] cars =    {new Car("Mustang","red"),
                        new Car("Honda","white"),
                        new Car("Charger","Yellow")}       ;

        for (Car car : cars) {
            car.color = "black";
            car.drive();
        }


    }
}