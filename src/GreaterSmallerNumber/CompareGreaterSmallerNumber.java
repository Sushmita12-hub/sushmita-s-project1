package GreaterSmallerNumber;


public class CompareGreaterSmallerNumber {

    public static void compareGreaterThanSmallerNumber(int num1,int num2){
        if(num1>num2) {
            System.out.println(num1 + "is the biggest number");
            System.out.println( num2 + "is the smallest number");
        }
        else if(num1<num2){
            System.out.println(num2 +" is the biggest number");
            System.out.println(num1 + "is the smallest number");
        }
        else{
            System.out.println("They are equal");
        }


    }

    public static void main(String[] args) {
        compareGreaterThanSmallerNumber(10,10);

    }
}
