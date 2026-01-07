import java.util.HashMap;

public class sl2_longest_substring_with_dist_chr {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(brcheck( s));
    }
    public static int brcheck(String s){
     int max = 0;
     HashMap<Character, Integer> map = new HashMap<>();
     for (int i = 0; i < s.length(); i++) {
        map.clear();
        for (int j = i; j < s.length(); j++) {
            char ch = s.charAt(j);
              int count = map.getOrDefault(ch, 0)+1;
              if(count> 1)
              {
                break;
              }
              else map.put(ch, map.getOrDefault(ch, 0)+1);
            max = Math.max(max, map.size());
        }
     }
     return max;
    }

    public static int btcheck(String s){
    int right = 0;              // window right pointer
    int left = 0;               // window left pointer
    int max = 0;             // max length found
    HashMap<Character, Integer> map = new HashMap<>(); // char -> last seen index

    while (right < s.length()) {
        char ch = s.charAt(right);          // current char

        if (map.containsKey(ch)) {
            if (map.get(ch) >= left)       // duplicate inside window
                left = map.get(ch) + 1;    // move left
        }
        
        map.put(ch, right);                // update last position
        max = Math.max(max, right - left + 1); // window size
        right++;                           // should be after max check
    }
    return max;
}

}
