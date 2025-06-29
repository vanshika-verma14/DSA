public class o {
    public static void main(String[] args) {
        
    }
    class Solution {
    private int getCommonPrefix(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) return i;
        }
        return len;
    }

    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        if (n == 1) return new int[]{0};

        int[] rt = new int[n];
        int[] lp = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            lp[i] = getCommonPrefix(words[i], words[i + 1]);
        }
        int[] pm = new int[n];
        pm[0] = 0;
        for (int i = 1; i < n - 1; i++) {
            pm[i] = Math.max(pm[i - 1], lp[i - 1]);
        }
        int[] sm = new int[n];
        sm[n - 1] = 0;
        for (int i = n - 2; i >= 1; i--) {
            sm[i] = Math.max(sm[i + 1], lp[i]);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                rt[i] = sm[1];
            } else if (i == n - 1) {
                rt[i] = pm[n - 2];
            } else {
                int newLCP = getCommonPrefix(words[i - 1], words[i + 1]);
                rt[i] = Math.max(pm[i -1], Math.max(newLCP, sm[i+ 1] ));
            }
        }
        return rt;

        
    }
}

}
