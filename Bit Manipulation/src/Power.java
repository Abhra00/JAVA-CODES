import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        System.out.println("Enter the power:");
        int pow = input.nextByte();
        System.out.println(power(num, pow));
    }

    static int power(int num, int power){
        int ans = 1;
        while(power != 0) {
            if((power & 1) == 1) {
                ans *= num;
            }
            num *= num;
            power = power >> 1;
        }
        return ans;
    }
}
