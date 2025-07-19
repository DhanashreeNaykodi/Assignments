import java.util.Arrays;

public class Q14 {

    static void arrange(int arr[]) {
        int n = arr.length;
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == 0)
            {
                zeros++;
            }
            else if(arr[i] == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        int i=0;
        while(zeros>0){
            arr[i] = 0;
            zeros--;i++;
        }
        while(ones>0){
            arr[i] = 1;
            ones--;i++;
        }
        while(twos>0){
            arr[i] = 2;
            twos--;i++;
        }
    }
    public static void main(String[] args) {
        //0 - white
        //1 - blue
        //2 - red
        int arr[] = {1,0,0,0,0,2,1,0,2};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
