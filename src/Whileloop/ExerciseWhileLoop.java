package Whileloop;

public class ExerciseWhileLoop {


    public static void main(String[] args) {

        double accountBalance = 1000.00;
        double threshold = 50.00;
        double fee = 100.00;
        String message = "Your account balance is low";


        while( accountBalance > threshold){
            System.out.println("User's current accont balance =" + accountBalance);
            accountBalance = accountBalance - fee;


        }
        System.out.println( message);

    }

}
