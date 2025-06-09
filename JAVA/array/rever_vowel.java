public class rever_vowel {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels( s));
    }
    public static String reverseVowels(String s) {
        int i=0;
        int j = s.length()-1;
        String ss= null;
        char start = s.charAt(i);
        char end = s.charAt(s.length()-1);
        System.out.println(start + " " + end);
        while(j>=i){
            
            if((start=='a'||start=='e'||start=='i'||start=='o'||start=='u'||start=='A'||start=='E'||start=='I'||start=='O'||start=='U') && (end=='a'|| end=='e'||end=='i'||end=='o'||end=='u'||end=='A'||end=='E'||end=='I'||end=='O'||end=='U'))
              {
                char temp = start;
              start = end;
              end = temp;
              System.out.println(s);}

            else if(start!='a'||start!='e'||start!='i'||start!='o'||start!='u'||start!='A'||start!='E'||start!='I'||start!='O'||start!='U')
            {   ss += s.charAt(i);
                i++;}
        
            else if (end!='a'||end!='e'||end!='i'||end!='o'||end!='u'||end!='A'||end!='E'||end!='I'||end!='O'||end!='U' )
           {
            ss += s.charAt(i);
            j--;
           }

        }
        return s;
    }
}
