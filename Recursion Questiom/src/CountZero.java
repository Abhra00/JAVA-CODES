public class CountZero {
    public static void main(String[] args) {
        int n = 10204;
        System.out.println(countZero(n, 0));
    }
    
    static int countZero(int n, int count) {
        if(n == 0) {
            return count;
        }

        if((n % 10) == 0) {
            return countZero(n / 10, count + 1);
        }

        return countZero(n/ 10, count);
    }
}
