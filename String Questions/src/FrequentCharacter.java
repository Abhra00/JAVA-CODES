

public class FrequentCharacter {
    public static void main(String[] args) {
        String str = "template";
        System.out.println(mostFrequentCharacter(str));
    }

    static char mostFrequentCharacter(String str) {
        int[] freq = new int[26];
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            freq[index]++;
        }
        int max = 0;
        for(int i = 1; i < freq.length; i++) {
            if(freq[i] > freq[max]) {
                max = i;
            }
            if(freq[i] == freq[max]) {
                max = Math.min(max, i);
            }
        }
        char ch = (char)(max + 'a');
        return ch;
    }
    
}
