public class HomoGeneousStringCount {
    public static void main(String[] args) {
        String str = "abbcccaa";
        System.out.println(countHomogenous(str));
    }

    static int countHomogenous(String s) {
        long ans = 0;
        int mod = 1000000007;
        for(int i = 0; i < s.length(); i++) {
            long count = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            } 
            ans += (count * (count + 1)) / 2;
            
        }
        ans = ans % mod;
        return (int)ans;
    }
    
}
