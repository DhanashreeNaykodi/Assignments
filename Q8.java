//Spiral matrix

import java.util.ArrayList;
public class Q8 {

    static void Pattern(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, top = 0;
        int right = cols-1, bottom = rows-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(left <= bottom && left <= right) {

            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i=right; i>= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        Pattern(matrix);
    }
}
