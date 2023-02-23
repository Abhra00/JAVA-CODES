public class KthBit {

    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1));
    }


    static char findKthBit(int n, int k) {
        String s1 = "0";
        String  nStr = formString(s1, n -1);
        System.out.println(nStr);
        return nStr.charAt(k - 1);
    }

    static String formString(String str, int n) {
        if(n == 0) {
            return str;
        }
        String temp = str + "1";
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(ch == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        sb.reverse();
        sb.insert(0, temp);
        return formString(sb.toString(), n - 1);
    }
}
