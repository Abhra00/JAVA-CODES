public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] str = {"abc", "bce", "cae"};
        System.out.println(minDeletionSize(str));
    }

    static int minDeletionSize(String[] strs) {
        int k = strs[0].length();
        int dltCount = 0;
        for(int col = 0; col < k; col++) {
            for(int row = 1; row < strs.length; row++) {
                if(strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    dltCount++;
                    break;
                }
            }
        }
        return dltCount;
    }
}
