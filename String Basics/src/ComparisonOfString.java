public class ComparisonOfString {
    public static void main(String[] args) {
        String name = "Abhra Mondal";
        String b = "Abhra Mondal";
        System.out.println(name == b);
//        Creating different object with same value
        String name1 = new String("Abhra Mondal");
        String name2 = new String("Abhra Mondal");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(3));
    }
}
