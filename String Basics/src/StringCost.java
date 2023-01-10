import java.util.Scanner;

public class StringCost {
    public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
	    int T = in.nextInt();
		while(T >= 0 && in.hasNextLine()) {
		    String x = in.nextLine();
		    String S = x.toLowerCase();
		    int cost = 0;
		    for(int i = 0; i < S.length(); i++) {
		        if(Character.isLetter(S.charAt(i))) {
		            if(S.charAt(i) == 'a'|| S.charAt(i) == 'e'|| S.charAt(i) == 'i'|| S.charAt(i) == 'o'|| S.charAt(i) == 'u') {
		                cost += 1;
		            } else {
		                cost += 2;
		            }
		        } else {
		            cost += 3;
		        }
		    }
		    System.out.println(cost);
		    T--;
		}
        in.close();
}
}
