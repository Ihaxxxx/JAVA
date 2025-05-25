public class Car {

    String make  = "Honda" ;
    String model = "Civic" ;
    int year = 2025 ;
    double price = 50000 ;
    boolean isRuning = false ;

    void start(){
        isRuning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRuning = false;
        System.out.println(("You stopped the engine"));
    }

    void Drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
}
