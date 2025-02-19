public class StrinngMethods {
    public static void main(String[] args) {
        String name  = " Mubashir Asif " ;
//        int lenght = name.length() ;
//        System.out.println(lenght);

        char letter = name.charAt(0);
//        System.out.println(letter);

        int index = name.indexOf("a");
//        System.out.println(index);

        int lastIndex = name.lastIndexOf("i");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        String lowerName = name.toLowerCase();
        System.out.println(lowerName);

        String noWhiteSpace = name.trim() ;
        System.out.println(noWhiteSpace);

        lowerName = lowerName.replace("u","a");
        System.out.println(lowerName);

        System.out.println(lowerName.isEmpty());

        String nigga = "POLY";

        if (nigga.isEmpty()){
            System.out.println("Your name is empty");
        }else {
            System.out.println("Hello " + nigga);
        }

        if (nigga.contains(" ")){
            System.out.println("Your name contains space");
        }else {
            System.out.println("Your name contains no space");
        }


        name = "Password";

        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        }else {
            System.out.println("Hello "+name);
        }

    }
}
