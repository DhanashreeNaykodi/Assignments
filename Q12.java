//Given an array of integers and an integer target, return indices of the
//two numbers such that they add up to target.

import java.util.Arrays;
public class Q12 {

    public int[] find(int arr[], int target) {

        //Arrays.sort(arr);
        int res[] = {-1,-1};
        int sum=0;
        int i=0;
        int j=arr.length-1;

        while(i<j) {
            sum = arr[i] + arr[j];
            if(sum == target) {
                res[0] = i;
                res[1] = j;
                return res;
            }
            else if(sum < target) {
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Q12 q = new Q12();
        int arr[] = {1,3,5,6};
        System.out.println(Arrays.toString(q.find(arr, 11)));
    }
}
