package Arrays.Medium;

import java.util.ArrayList;

public class ArraylistQue {
    public static void main(String[] args) {
        int n=5;
        String[] words = {"leet","code", "ria"};
        char x = 'e';
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0; i< words.length; i++){
            for(int j=0; j< words[i].length(); j++) {
                if (words[i].charAt(i) == 'e') {
                    list.add(i, 1);
                    break;
                }
            }
            if(list.get(i) != '1')
                list.add(i, 0);
        }
        System.out.println(list);
    }
}
