import java.util.ArrayList;

public class SubsequenceReturn {

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1)); // include
        ArrayList<String> right = subseqRet(p, up.substring(1));     // exclude

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> result = subseqRet("", input);
        System.out.println("All subsequences of \"" + input + "\":");
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
