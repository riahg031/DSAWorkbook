package striver.Arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr= {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement2(arr));
        System.out.println(majorityElement3(arr));
    }
    //Brute force: TC: O(n^2), SC: O(1)
    public static int majorityElement(int[] arr){
        for(int i=0; i< arr.length;i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]== arr[j])
                    count++;
            }
            if(count> arr.length/2)
                return arr[i];
        }
        return -1;
    }
    //Better approach: Hashing => TC:(n+ nlogn), SC: O(n)
    public static int majorityElement2(int[] arr){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        for(Map.Entry<Integer, Integer> it: map.entrySet())
            if(it.getValue() > arr.length/2)
                return it.getKey();
        return -1;
    }
    //Optimal approach=> Moore's algo: TC: O(), SC()
    public static int majorityElement3(int[] arr){
        int element=0;
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(count==0){
                element= arr[i];
                count++;
            }
            else if(element== arr[i])
                count++;
            else
                count--;
        }
        count=0;
        for(int i=0; i<arr.length; i++)
            if(element==arr[i])
                count++;
        if(count> arr.length/2)
            return element;
        return -1;
    }
}
