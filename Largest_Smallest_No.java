//Find largest and small number in an array

public class Largest_Smallest_No {
    static void find(int arr[]) {

        int maxi = arr[0];
        int mini = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
            if(arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Smallest number in an array : " + mini);
        System.out.println("Largest number in an array : " + maxi);
    }
    public static void main(String[] args) {
        int arr[] = {9,3,2,-9,6,7,0};
        find(arr);
    }
}
