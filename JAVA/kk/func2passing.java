public class func2passing {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is - " + a + " b is - " + b);
        // swap numbers code
        swap(a, b); 
        System.out.println("ATER SWAP - a is - " + a + " b is - " + b); //no change here

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("ATER SWAP in function scop - a is - " + num1 + " b is - " + num2);

        // this change will only be valid in this function scope only.Therefore no swap occurs 
    }
    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
    }

}
