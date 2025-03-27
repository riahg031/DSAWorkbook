package striver.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args){
        int[] arr= {3,1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
        System.out.println(Arrays.toString(rearrangeArray2(arr)));
        System.out.println(Arrays.toString(rearrangeArray3(arr)));
    }
    //Brute force: TC: O(n+ n/2), SC: O(n)
    public static int[] rearrangeArray(int[] arr){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] >=0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        for(int i=0; i<pos.size(); i++){
            arr[2*i]= pos.get((i));
            arr[2*i+1]= neg.get(i);
        }
        return arr;
    }
    //Optimal approach: TC: O(), SC: O()
    public static int[] rearrangeArray2(int[] arr){
        int[] res= new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>=0){
                res[pos]= arr[i];
                pos+= 2;
            }
            else{
                res[neg]= arr[i];
                neg+= 2;
            }
        }
        return res;
    }
    //Modified version where (no of -ve elements) != (no of +ve elements)
    //TC: O(2n), => TC= O(n)+ O(min(pos.size(), neg.size()) + remaining => Best case: O(n+ 0 + n), worst case: O(n+ n/2+ 0)
    // SC: O(n)
    public static int[] rearrangeArray3(int[] arr){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] >=0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        if(pos.size()<= neg.size()){
            for(int i=0; i<pos.size(); i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1]= neg.get(i);
            }
            int index= pos.size()* 2;
            for(int i=pos.size(); i<neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        else{
            for(int i=0; i<neg.size(); i++){
                arr[2*i]= pos.get(i);
                arr[2*i+1]= neg.get(i);
            }
            int index= neg.size()* 2;
            for(int i=neg.size(); i<pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }
        return arr;
    }
}
