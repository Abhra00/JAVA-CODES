public class Operators {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("A" + "B");
        System.out.println('a' + 5);
        System.out.println((char)('a' + 5));
        System.out.println("A" + 1); // !This will convert the integer into Integer wrapper class
//        !And Calls the to string method
//        !This is same as after a few steps :- "A" + "1";
    }
}
