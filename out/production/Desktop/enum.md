class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE } // semicolon is not mandatory
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println(juice.size);
   }
}


Output:
MEDIUM