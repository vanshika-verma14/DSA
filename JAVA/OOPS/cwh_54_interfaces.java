//variables are static and final by default in interfaces not instance, final coz interface cannot have constructors so how will they be initialised theref final as they always have to be initialised
//abstract class can provide implementation of a interface, interface cant provide implementation of a class
// we can implement multiple interfaces together
// members of java interface r public by default 
//a class can implement more than one interfaces but it can only inherit only 1 super class or abstract class, indirectly multiple inhertence allowed

//Interfaces in Java :
// Just like a class in java is a collection of the related methods, an interface in java is a collection of abstract methods.
// The interface is one more way to achieve abstraction in Java.
// An interface may also contain constants, default methods, and static methods.
// All the methods inside an interface must have empty bodies except default methods and static methods.
// We use the interface keyword to declare an interface.
// There is no need to write abstract keyword before declaring methods in an interface because an interface is implicitly abstract.
// An interface cannot contain a constructor (as it cannot be used to create objects)
// In order to implement an interface, java requires a class to use the implement keyword.

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{  //class AvonCycle extends cycle implements Bicycle, HornBicycle  //1 extented class also possible along with interface if there is a cycyle class
    int a = 5; //now 5 will be prited as variable is overridden
     int speed = 5;
    void blowHorn(){ //method of class
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){  //writing public is imp for these implemented overridden method
        speed = speed - decrement;
        System.out.println("Applying Brake - " + speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Applying SpeedUP - " + speed);
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle objcycle = new AvonCycle();
        objcycle.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(objcycle.a);
        System.out.println(objcycle.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        objcycle.blowHornK3g();
        objcycle.blowHornmhn();
    }
}


