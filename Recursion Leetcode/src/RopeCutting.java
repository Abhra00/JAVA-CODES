public class RopeCutting {

    public static void main(String[] args) {
        System.out.println(maxPieces(23, 11, 12, 9));
    }

    static int maxPieces(int n, int a, int b, int c) {
        if(n == 0) {
            return 0;
        }

        if(n < 0) {
            return -1;
        }

        int res = Math.max((maxPieces(n - a, a, b,c)), (maxPieces(n - b, a, b,c)));
        res = Math.max(res, (maxPieces(n - c, a, b,c)));

        if(res == -1) {
            return -1;
        }

        return res + 1;
    }
}
