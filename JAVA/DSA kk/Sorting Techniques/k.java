class k {
    public static void main(String[] args) {
            String s = "foobar";
            char b = 'o';
            System.out.println(percentageLetter(s,b));
    }
    public static int percentageLetter(String s, char letter) {
        double c =0;
        for(int i = 0; i < s.length(); i++){
          if(s.charAt(i)==letter)
          {c++;
          System.out.println(c);}
        }
        int n = s.length();
        System.out.println(n);
        double p = (c/n)*100.0;
        return (int)p;
    }
}