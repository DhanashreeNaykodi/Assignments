// Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class Q13 {

    static int Func(int arr[]) {
        int sum = 0;
        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum > maximum) {
                maximum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 2, 9, 4, 6, -12, 50};
        int arr[] = {2, 9, 4, 6, -21, -200};
        System.out.println(Func(arr));
    }
}
