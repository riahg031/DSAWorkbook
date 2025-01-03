package striver.Arrays.easy;

public class MissingNum {
    public static void main(String[] args){
        int[] a= {1, 4, 2, 3};
        System.out.println(findMissingNum(a));
        System.out.println(findMissingNum2(a));
        System.out.println(findMissingNum3(a));
        System.out.println(findMissingNum4(a));
    }
    //Brute force=> TC: O(n*n), SC: O(1)
    public static int findMissingNum(int[] a){
        for(int i=1; i<=a.length+1; i++){
            int flag=0;
            for(int j=0; j<a.length; j++){
                if(i == a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                return i;
        }
        return -1;
    }
    //Better approach: Hashing => TC: O(2n), SC: O(n+2)
    public static int findMissingNum2(int[] a){
        int n= a.length;
        int[] hash= new int[n+2];
        for(int i=0; i<n; i++)
            hash[a[i]]++;
        for(int i=1; i<n+2; i++)    //n+2= hash.length
            if(hash[i]==0)
                return i;
        return -1;
    }
    //Optimal approach1=> sum=> TC: O(n), SC: O(1)
    public static int findMissingNum3(int[] a) {
        int n= a.length+1;
        int arrSum=0, sum=0;
        for(int i=0; i<a.length; i++)
            arrSum += a[i];
        sum = n * (n+1)/2;
        return sum- arrSum;
    }
    //Optimal approach2=> XOR=> TC: O(n), SC: O(1)
    public static int findMissingNum4(int[] a) {
        int n = a.length + 1;
        int xor1=0;
        int xor2=0;
        for(int i=0; i<a.length; i++){
            xor1 ^= a[i];
            xor2 ^= i+1;
        }
        xor2 ^= n;
        return xor1^ xor2;
    }
}