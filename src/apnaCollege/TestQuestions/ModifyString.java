package TestQuestions;

/*
````Challenge token:
    1.Input: "99946"
      Output: "9-9-94*6"   ,final output: "--*6"
    2.Input: "56647304"
      Output: "56*6*47-304"   ,final output: "56*6*7-30"
 */

public class ModifyString {
    public static void main(String[] args) {
        String s = "99946";
        System.out.println(modify(s));
    }

    public static String modify(String s){
        StringBuilder sb = new StringBuilder(s);
        int j=0;
        for(int i=0; i<s.length()-1; i++){
            //both adjacent nos are even => insert '*'
            if((int) s.charAt(i) % 2 == 0 && (int) s.charAt(i+1) % 2 == 0 )
                if(s.charAt(i) != '0' && s.charAt(i+1) != '0') {
                    sb.insert('*', i);

                }
            //both adjacent nos are odd => insert '-'
            if((int) s.charAt(i) % 2 != 0 && (int) s.charAt(i+1) % 2 != 0 ) {
                sb.insert('-', i);
                i++;
            }

        }
        return sb.toString();
    }
}
