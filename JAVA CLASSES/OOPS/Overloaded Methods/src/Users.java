public class Users {
    String username ;
    String email ;
    int age ;

    Users(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0 ;
    }

    Users(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0 ;
    }
    Users(String username,String email){
        this.username = username;
        this.email = email;
        this.age = 0 ;
    }
    Users(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age ;
    }
}
