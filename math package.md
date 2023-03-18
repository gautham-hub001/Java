https://www.geeksforgeeks.org/java-lang-math-class-in-java-set-1/

Math.abs(x)
min(x,y)
max(x,y)
exp(x)
pow(x,y)
log(x) // base e
log10(x) // base 10
ceil(x)
floor(x)
round(x)
sqrt()
cbrt()
random() // returns pseudo random number between 0 and 1


Number of digits of a number:
int digits = (int)(Math.log10(n)) + 1;

Or
Convert it to string and use .length()

int n = 513413;
String s = String.valueOf(n);
System.out.println(s.length());