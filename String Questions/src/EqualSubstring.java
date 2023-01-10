public class EqualSubstring {
    public static void main(String[] args) {
        String s = "pxezla";
        String t = "loewbi";
        int maxCost = 25;
        System.out.println(equalSubstring(s, t, maxCost));
    }

    static int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        int cost = 0;
        int ans = 0;
        int head = 0;
        int tail = 0;
        while(head < len) {
            cost += Math.abs(s.charAt(head) - t.charAt(head));
            while(cost > maxCost) {
                cost -= Math.abs(s.charAt(tail) - t.charAt(tail));
                tail++;
            }
            ans = Math.max(ans, head - tail + 1);
            head++;
        }
        return ans;
    }
    
}
