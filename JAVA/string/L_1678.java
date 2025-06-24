public class L_1678{
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String command) {
       StringBuilder w = new  StringBuilder();
     int i =0;
       while( i<command.length())
       {
        if(command.charAt(i)== '(' &&command.charAt(i+1)== 'a') 
        {w.append("al");
          i+=4;}
        else if(command.charAt(i)== '(' &&command.charAt(i+1)== ')')
        {w.append("o");
        i+=2;}
        else
       { w.append("G");
       i++;}
       }
       return w.toString(); 
    }

}