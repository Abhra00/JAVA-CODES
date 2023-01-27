import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        System.out.println(diceList("", 4));
    }

    static ArrayList<String> diceList(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p + i, target - i));
        }
        return list;
    }
}
