import java.util.ArrayList;
import java.util.Arrays;

public class Q15 {
    static void Quad(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0; i<n-3; i++) {
            for(int j=i+1; j<n-2; j++) {
                int left = j+1;
                int right = n-1;

                while(left < right) {
                    int sum = arr[left] + arr[right] + arr[i] + arr[j];
                    if(sum == target) {
                        ArrayList<Integer> l = new ArrayList<>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[left]);
                        l.add(arr[right]);
                        System.out.println(l);
                        break;
                        //return;
                    }
                    else if(sum < target) {
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
    }

//    static void Quad(int arr[], int target) {
//        Arrays.sort(arr);
//        int n = arr.length;
//        int left = 0;
//        int right = n-1;
//        int ind = 1;
//
//        while(left < right && ind < n) {
//            int sum = arr[ind] + arr[left] + arr[right];
//            int a = Math.abs(target-sum);
//            if(Arrays.asList(arr).contains(a)) {
//                System.out.println(arr[left] + " " + arr[ind] + " " + arr[right] + " " + a);
//                break;
//            }
//            else if(sum < target) {
//                left++;ind++;
//            }
//            else{
//                right--;
//            }
//        }
//        System.out.println("No quadruplets!");
//    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,9,1,2,10,52};
        int target = 23;
        Quad(arr, target);
    }
}
