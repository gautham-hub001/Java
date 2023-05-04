public class OptionalParams {
    public static void main(String[] args) {
        fun1(123);
        fun1(123, 1);
        System.out.println("fun2");
        fun2(123);
        fun2(123, 1, 2);
        System.out.println("fun3");
        fun3(123);
        fun3(123, 1, "ads");
    }

    // method overloading
    static void fun1(int n, int b) {
        System.out.println(n + " " + b);
    }

    static void fun1(int n) {
        fun1(n, 0);
    }

    static void fun2(int n, Integer... b) { // If types of optional params is same: array of Integer objects is passed
        System.out.print(n + " ");
        if (b.length == 1) {
            System.out.println(b[0]);
            return;
        }
        if (b.length == 2) {
            System.out.println(b[0] + " " + b[1]);
        } // and so on
    }

    static void fun3(int n, Object... b) { // If types of optional params is different
        System.out.println(n);
        Integer b0 = 0;
        String b1 = "";
        if (b.length > 0) {
            if (b[0] instanceof Integer) {
                b0 = (Integer) b[0];
                System.out.print(b0 + " ");
                return;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (b.length > 1) {
            if (b[1] instanceof String) {
                b1 = (String) b[1];
                System.out.println(b1);
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
