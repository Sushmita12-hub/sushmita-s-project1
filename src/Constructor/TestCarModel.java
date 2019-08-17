package Constructor;

public class TestCarModel {
    public static void main(String[] args) {
        car myCar = new car();
        System.out.println(myCar.getBrand());

        car rishaanCar = new car("Mercedes" , 2019, 70000.00);
        car rajeshCar = new car("Audi","Q9",2019,90000.15,false);
        String rishaanCarbrand = rishaanCar.getBrand();
        System.out.println("Rishaan's car Brand:" +rishaanCarbrand);
        rishaanCar.setbrand("Honda");
        System.out.println("Rishaa's car Brand:" + rishaanCar.getBrand());
        String rajeshCarModel = rajeshCar.getModel();
        System.out.println("Rajesh's car Model:" + rajeshCarModel);
        rajeshCar.setModel("Q6");
        System.out.println("Rajesh's car Model:" + rajeshCar.getModel());
    }
}
