import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :->");
        int num = input.nextInt();
        if ((checkEven(num) == true)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }

    static boolean checkEven(int n) {
        boolean ans = (n & 1) == 0 ? true : false;
        return ans;
    }
}
