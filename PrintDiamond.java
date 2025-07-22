//Print pattern

public class PrintDiamond {
    static void MakePattern(int n) {

        for(int r=1; r<=n; r++) {

            for(int c=r; c<n; c++) {
                System.out.print(" ");
            }
            for(int s=1; s<r*2; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=n-1; r>0; r--) {

            for(int c=r; c<n; c++) {
                System.out.print(" ");
            }
            for(int s=1; s<r*2; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        MakePattern(n);
    }
}
