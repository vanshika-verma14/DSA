//Interfaces can extend other interfaces as shown below :
//Note: Remember that interface cannot implement another interface only classes can do that!
interface interf1{
    void meth1();
    void meth2();
}
interface interf2 extends interf1{
    // void meth1();   can also write here as well
    // void meth2();
    void meth3();
    void meth4();
}

class MySampleClass implements interf2{  // although it is implementing only interf2 but since interf2 extends interf1 therefore overridding interf1 method is also necessary else it will show error
    public void meth1(){      //from inter1
        System.out.println("meth1");
    }
    public void meth2(){     //from inter1
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class cwh_58_inheritance_interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
