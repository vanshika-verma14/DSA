
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().strip(); 
        scanner.close();

        int longestCount = 0;
        int currentCount = 0;
        int endPoint = 0;
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                currentCount++;
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    endPoint = i;
                }
                currentCount = 0;
                inWord = false;
            }
        }

        if (currentCount > longestCount) {
            longestCount = currentCount;
            endPoint = input.length();
        }

        String longestWord = input.substring(endPoint - longestCount, endPoint);

        System.out.println("Longest word: " + longestWord);
        System.out.println("Word count: " + wordCount);
    }
}