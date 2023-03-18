https://www.geeksforgeeks.org/java-lang-math-class-in-java-set-1/

Number of digits of a number:
int digits = (int)(Math.log10(n)) + 1;

Or
Convert it to string and use .length()

int n = 513413;
String s = String.valueOf(n);
System.out.println(s.length());