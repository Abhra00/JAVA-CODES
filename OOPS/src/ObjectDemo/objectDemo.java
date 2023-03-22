package ObjectDemo;

public class objectDemo {
    int num;
    public objectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        objectDemo obj1 = new objectDemo(34);
        objectDemo obj2 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1 instanceof  Object);
    }
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
