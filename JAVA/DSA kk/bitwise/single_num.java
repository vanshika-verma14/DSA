public class single_num {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5,3,1,2,3};
        int ans[] = 
        System.out.println("Missing: " + ans[0]+ "\n" + "Twice: " + ans[1]);
            }
        
            public static int check(int[] arr) {
                int unique =0;
                for (int i = 0; i < arr.length; i++) {
                    
                    unique = unique^arr[i];
                }
                return unique;
            }
    
}
