public class VariableScope {
//    Global
    static int  x = 3 ;

    public static void main(String[] args) {
//        local scope
        int x = 1 ;
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
//        local Scope
        int x = 2 ;
        System.out.println(x);
    }
}
