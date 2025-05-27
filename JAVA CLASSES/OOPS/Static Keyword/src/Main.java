public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Muaaz");
        Friend friend2 = new Friend("Hamza");
        Friend friend3 = new Friend("Ammaar");
        Friend friend4 = new Friend("Hashir");
        Friend friend5 = new Friend("Hamna");

//        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();


        System.out.println(Math.round(3.66));
    }
}