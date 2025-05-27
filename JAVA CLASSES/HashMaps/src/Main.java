import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();

        map.put("Apple",0.50);
        map.put("Orange",0.75);
        map.put("Banana",0.25);
        map.put("Cocunut",1.00);

//        map.put("Orange",1.25);

//        map.remove("Apple");

    //   System.out.println(map.get("Cocunut"));

//        System.out.println(map.containsKey("Poly"));

//        if (map.containsKey("Poly")){
//            System.out.println(map.get("Apple"));
//        }else {
//            System.out.println("Key not Found!");
//        }

        System.out.println(map.containsValue(1.00));

        System.out.println(map.size());


        for (String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key) );
        }


    }
}
