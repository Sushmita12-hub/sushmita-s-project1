package ConditionalStatement;

public class IfElseStatement {
    // find out odd or even number
    public static void main(String[] args) {
        checkIfNumberIsOddOrEven(112);
        checkIfNumberIsOddOrEven(111);

    }


    public static void checkIfNumberIsOddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else {
            System.out.println(num + " is odd");
        }

    }

}


