import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        // System.out.println("Hi");
//        System.out.print(args[0]);
        System.out.println("enter num1: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("enter num2: ");
        int num2 = input.nextInt();
        System.out.println("sum: "+ (num1+num2));
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        System.out.println("product: "+(num3*num4));

        int a = (int) 4.3f;
    }
}

//cannot be public - gives error
//public class Demo2 {
//    public void getRoll() {
//        System.out.println("rollno");
//    }
//}