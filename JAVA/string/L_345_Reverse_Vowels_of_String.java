

public class L_345_Reverse_Vowels_of_String {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public  static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        System.out.println(ch); 
         int i=0;
         int j = ch.length-1;

        while(i<=j){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'|| ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U' && ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')
            {char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            System.out.println("o "+ " "+ch[i]+ " "+ ch[j]+ " " +new String(ch));
            i++;
            j--;}

             if(ch[i]!='a' && ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&
            ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
           { i++;
            System.out.println("s "+new String(ch));}
        
             if (ch[j]!='a'&&ch[j]!='e'&&ch[j]!='i'&&ch[j]!='o'&&ch[j]!='u'&&ch[j]!='A'&&
            ch[j]!='E'&&ch[j]!='I'&&ch[j]!='O'&&ch[j]!='U' )
           { j--;
            System.out.println("h "+new String(ch));}

        }
        return new String(ch);
    }
}
