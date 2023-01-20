public class ReverseBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(reverseBits(n)));
    }

    static int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            int lsb = n & 1;
            int reverseLsb = lsb << (31 - i);
            result = reverseLsb | result;
            n = n >> 1;
        }
        return result;
    }
}
