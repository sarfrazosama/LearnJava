package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading methOver = new MethodOverloading();
        methOver.login("Roger","FTr66566");
        methOver.login(126364,"HGGg76567");
        methOver.login("Pascal",126487,"TYy88487");
    }

    public void login(String uname, String password){
        System.out.println("Able to login using username: " +uname +" and password: " +password);
    }

    public void login(int phone, String password){
        System.out.println("Able to login using phone number: " +phone +" and password: " +password);
    }

    public void login(String uname, int phone, String password){
        System.out.println("Able to login using username: " +uname+ " phone number: " +phone +" and password: " +password);
    }
}
