public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        plants plant = new plants();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);


        System.out.println(dog.lifes);
        System.out.println(cat.lifes);

        dog.Speak();
        cat.Speak();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);


        plant.photosythesise();
    }
}