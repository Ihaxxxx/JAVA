public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void Speak(){
                System.out.println("Scooby Doo says *Ruh Ruh*");
            }
        };
//        TalkingDog talkingDog = new TalkingDog();

        dog1.Speak();
        dog2.Speak();



    }
}
