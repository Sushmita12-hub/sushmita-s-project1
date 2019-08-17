package Abstraction;

public abstract class SmartPhone implements Phone {

    public abstract void touchScreen();
    public void browsing
    public void call(){
        System.out.println( "Smart phone calling");

    }
    public void text(String message){
        System.out.println("Texed: " + message);
    }
}
