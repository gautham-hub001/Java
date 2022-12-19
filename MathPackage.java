public class MathPackage {
    public static void main(String[] args) {
        // max
        System.out.println(Math.max(1,3));
        System.out.println(Math.max(5.1,3));

        // min
        System.out.println(Math.min(5.1,-0.3));

        // sqrt
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(5.1));
        System.out.println(Math.sqrt(-5.1)); // returns NaN for -ve values

        // cube root cbrt()
        System.out.println(Math.cbrt(27));
        System.out.println();

        // abs
        System.out.println(Math.abs(5.1));
        System.out.println(Math.abs(-5.1));

        // random
        System.out.println(Math.random()); // returns random number between 0(inclusive) to 1 (exclusive) -> [0.0, 1.0)
        System.out.println(Math.random() * 100); // if you want random number [0.0, 100.0)
        System.out.println((int) (Math.random() * 101) ); // if you want random number [0.0, 100.0]

        // ceil
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.ceil(-3.0));
        System.out.println(Math.ceil(-3.2));
        System.out.println(Math.ceil(-3.9));
        System.out.println();

        // floor
        System.out.println(Math.floor(3));
        System.out.println(Math.floor(3.2));
        System.out.println(Math.floor(-3));
        System.out.println(Math.floor(-3.2));
        System.out.println();

        // round
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));
        System.out.println();

        // exp
        System.out.println(Math.exp(1));
        System.out.println();

        // pow
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.pow(-4, 3));
        System.out.println(Math.pow(4, 1.2));
        System.out.println(Math.pow(-4, 1.2)); // NaN. For -ve base, the power should only be integer, otherwise it gives NaN.
        System.out.println();

        // e and pi
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println();

        // toRadians, toDegrees
        System.out.println(Math.toRadians(1));
        System.out.println(Math.toDegrees(1));
        System.out.println();

        // sin, cos, tan, sinh, cosh, tanh......
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
