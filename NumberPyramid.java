//Print pattern

public class NumberPyramid {
    static void makepattern(int n) {

        for(int r=0; r<n; r++) {

            for(int c=1; c<=n-r; c++) {

                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        makepattern(n);
    }
}
