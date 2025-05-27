public class Main {
    public static void main(String[] args) {
        String a = Integer.toString(233);
        String b = Double.toString(322);
        String c = Character.toString('@');
        String d = Boolean.toString(false);
        System.out.println(a+b+c+d);


        int x = Integer.parseInt("123");
        double y = Double.parseDouble("3.44");
        char m = "Pizzà".charAt(0);
        boolean f = Boolean.parseBoolean("true");


        char letter = 'M';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}