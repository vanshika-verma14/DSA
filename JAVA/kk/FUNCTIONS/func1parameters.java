import java.util.Scanner;
public class func1parameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String personalised = greet(name);
        System.out.println(personalised);
    }
    static String greet(String n) {
        String msg = "Hello " + n + "!\nHow are you?";
        return msg;
        
    }
}
