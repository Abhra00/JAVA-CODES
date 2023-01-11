import java.util.Scanner;

public class AllPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        pattern3(n);
//        pattern2(n);
//        pattern1(n);
//        palinDromePattern(n);
        pattern4(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for(int row = 1; row <= 2 * n; row++) {
            int total_col_in_row = row > n ? 2 * n - row : row;
            int noOfSpaces = n - total_col_in_row;
            for(int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= total_col_in_row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void palinDromePattern(int n) {
        for(int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
//            For the spaces
            for(int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
//            For the first part
            for(int col = row; col >= 1; col--) {
                System.out.print(col);
            }
//            For the second part
            for(int col2 = 2; col2 <= row; col2++) {
                System.out.print(col2);
            }
            System.out.println();
        }
    }
    static void pattern4 (int n) {
        n = n * 2;
        for(int row = 0; row <= n; row++) {
            for(int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min((Math.min(col, row)), (Math.min(n - col, n - row)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
