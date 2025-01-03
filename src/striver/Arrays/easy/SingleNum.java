package striver.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

// Find the number that appears once, and the other numbers twice.
public class SingleNum {
    public static void main(String[] args){
        int[] arr= {2, 2, 13, 4, 6, 6, 4};
        System.out.println(findSingleNum(arr));
        System.out.println(findSingleNum2(arr));
        System.out.println(findSingleNum3(arr));
        System.out.println(findSingleNum4(arr));
    }
    //Brute force: linear search => TC: O(n*n), SC: O(1)
    public static int findSingleNum(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count=0;
            //linear search
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count==1)
                return arr[i];
        }
        return -1;
    }
    //Better approach !: Hashing => TC: O(3n), SC: O(max element of arr)
    //Can't be used for array having -ve numbers or numbers > 10^5. In that case hashmap will be used.
    //Only for array having +ve numbers.
    public static int findSingleNum2(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
            if(arr[i] > max)
                max= arr[i];
        int[] hash= new int[max+1];
        for(int i=0; i<arr.length; i++)
            hash[arr[i]]++;
        for(int i=0; i<arr.length; i++)
            if(hash[arr[i]] ==1)
                return arr[i];
        return -1;
    }
    //Better approach 2: Hashmap => TC: O(n*log(n/2 +1) +n/2 +1), SC: O(n/2 +1)
    public static int findSingleNum3(int[] arr){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++)
            if(!map.containsKey(arr[i]))
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            else
                map.put(arr[i], map.get(arr[i])+1);
        for(Map.Entry<Integer, Integer> it: map.entrySet())
            if(it.getValue()== 1)
                return it.getKey();
        return -1;
    }
    //Optimal approah: XOR => TC: O(n), SC: O(1)
    public static int findSingleNum4(int[] arr){
        int xor=0;
        for(int x: arr)
            xor ^= x;
        return xor;
    }
}
