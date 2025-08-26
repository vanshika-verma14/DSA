import java.util.HashMap;

public class Majority_Element_I {
    public static void main(String[] args) {
        int[] arr = {5,5,7,1,4,7,1,5,5,5,5,7,7,5,5,5,1};
        System.out.println(opcheck(arr));
    }
    public static int check(int[] arr){  //better using hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {          
            int count = map.getOrDefault(arr[i], 0)+1;
            map.put(arr[i], count);
            if(count > arr.length/2){
                return arr[i];
            }}
        return -1; 
    }
 public static int opcheck(int[] arr){  //optimal using moore voting algo

    int el=0;
    int cnt= 0;
    for (int i = 0; i < arr.length; i++) { //{5,5,7,1,4,7,1,5,5,5,5,7,7,5,5,5,1}
        if(cnt==0){
            cnt=1;
            el= arr[i];

        }
        else if(arr[i]==el){
            cnt++;
        }
        else
        cnt--;
    }
    return el;
    }
}
