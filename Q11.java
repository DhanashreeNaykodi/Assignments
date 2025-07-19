//Print pattern

public class Q11 {
    static void PrintPattern(int n) {

        for(int r=1; r<=n; r++) {
            for(int s=0; s<r; s++) {
                System.out.print("*");
            }
            for(int sp=(n*2)-r; sp>r; sp--) {
                System.out.print(" ");
            }
            for(int s=0; s<r; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=1; r<=n; r++) {

            for(int s=n; s>=r; s--) {
                System.out.print("*");
            }
            for(int sp=1; sp<r*2-1; sp++) {
                System.out.print(" ");
            }
            for(int s=n; s>=r; s--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        PrintPattern(n);
    }
}
