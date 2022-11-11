Static variable

Public class Counter {
	static int x =0;
	Counter() {
		x++;
	}
	public static void main(String[] args) {
          Counter c1 = new Counter(); // 1
          Counter c1 = new Counter(); // 2
          Counter c1 = new Counter(); // 3
    	}
}

Static method

class Test
{
    // static method
    static void m1()
    {
        System.out.println("from m1");
    }
  
    public static void main(String[] args)
    {
          // calling m1 without creating
          // any object of class Test
           m1(); // not this.m1() because "this" is a non-static variable
    }
}

