public class SetBit {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Integer.toBinaryString(n));
        int position = 1;
        int ans = setBit(n, position);
        System.out.println(Integer.toBinaryString(ans));
    }

    static int setBit(int n, int position) {
        int mask = 1 << (position - 1);
        return (n | mask);
    }
}
