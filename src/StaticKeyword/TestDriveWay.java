package StaticKeyword;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay somadriveWaySize = new DriveWay();
        somadriveWaySize.setDriveWaySize(12);
        System.out.println("Soma's DriveWay Size:" + somadriveWaySize.getDriveWaySize());

        DriveWay rishaandriveWaySize = new DriveWay();
        rishaandriveWaySize.setDriveWaySize(15);
        System.out.println("Rishaan's DriveWay Size:" + rishaandriveWaySize.getDriveWaySize());

        System.out.println("Soma's DriveWay Size:" + somadriveWaySize.getDriveWaySize());

//static method there is no need of create object
        DriveWay.shapeOfDriveWay();


    }
}
