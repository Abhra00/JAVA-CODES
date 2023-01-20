public class CountSetBits {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(countSetBits(num));
    }

    static int countSetBits(int num) {
        int count = 0;
//        while(num != 0) {
//            if( (num & 1) == 1) {
//                count++;
//            }
//            num = num >> 1;
//        }
        while(num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
    
}
