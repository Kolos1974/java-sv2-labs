package finalmodifier;

public class Gentleman {
    private static final String MESSAGE_PREFIX = "Üdvözlöm";

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("Farkas Bertalan"));
    }

    public String sayHello(String name){
        return MESSAGE_PREFIX+", "+name+"!";
    }

}
