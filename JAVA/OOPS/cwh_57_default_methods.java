
interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){  //private method can only be access inside interface
        System.out.println("Good Morning");
    }

    default void record4KVideo(){
        greet();    //calling the private msg
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{

    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{   //class 1
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){    //from intfc 1
        System.out.println("Taking snap");
    }
    public void recordVideo(){   //from intfc 1
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){   //from intfc 2
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){   //from intfc 2
        System.out.println("Connecting to " + network);
    }
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
