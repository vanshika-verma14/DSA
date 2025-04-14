//  GPS g          =    new Smartphone ( );  can only use GPS method 
//  Smartphones    =    new Smartphone ( );   can only use smartphone methods 
//  Implementing an Interface force method implementation

interface MyCamera2{
    int y = 15;
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone2 implements MyWifi2, MyCamera2{
    int x = 5;
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone(); // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMeth(); --> Not allowed
        cam1.record4KVideo();
        System.out.println(cam1.x);
        System.out.println(cam1.y);

        MySmartPhone s = new MySmartPhone();  // it can access all methods and variables of MySmartPhone
        System.out.println(s.x);
        System.out.println(s.y);
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(7979);
    }
}
