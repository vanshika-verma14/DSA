//generic interface

interface container<T>{
public void set(T num);
public T get();

}

class cont<T> implements container<T>{  
    private T item;
    @Override
    public void set(T n) {
        item = n;
    }
    @Override
    public T get() {
        return item;
    }    
}

public class generic2 {
    public static void main(String[] args) {
        cont<String> ob = new cont<>();
        ob.set("vanshika");
        System.out.println(ob.get());

        cont<Integer> ob1 = new cont<>();
        ob1.set(123);
        System.out.println(ob1.get());
    }
}
