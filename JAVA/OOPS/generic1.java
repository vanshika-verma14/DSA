class box{
    private Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value= value;

    }

}
class box1<T>{
    private T value;
    
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value= value;

    }
}

 class pair<K,V>{    // K and V are basically objects type occupier, you can put K and V as any datatype thus this class can be used as class of any datatype that u want to define while calling in main
    private K key; 
    private V value;

    public pair(K key, V value){ // K and V can be string , integer etc that is define in main
        this.key = key;
        this.value = value;
    }
    
    public K getkey(){
        return key;
    }
    public V getvalue(){
        return value;
    }

}

public class generic1 {
    public static void main(String[] args) {
        box ob = new box();
        ob.setValue(12);
        int i = (Integer) ob.getValue();
        System.out.println(i);

        box1<Integer> ob1 = new box1<>();
        ob1.setValue(123);
        int ii = ob1.getValue(); //now we dont have to specify the type
        System.out.println(ii);

        box1<String> ob2 = new box1<>();
        ob2.setValue("mumma");
        String i2 = ob2.getValue(); //now we dont have to specify the type
        System.out.println(i2);

        pair<String, Integer> ob3 = new pair<>("Vanshika", 1);
        String st = ob3.getkey();
        int in = ob3.getvalue();
        System.out.println(st);
        System.out.println(in);

    }
}
 