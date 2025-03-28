package Strings;

public class stringCompression {
    public static void main(String[] args) {
        String str = "abc";    //"aaaabbcccdee";
        System.out.println(compress(str));
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
           Integer count =1;
           while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
               count++;
               i++;
           }
           if(count>1){
               sb.append(str.charAt(i));
               sb.append(count);
           }
           else
               sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
