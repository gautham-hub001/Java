**https://www.programiz.com/dsa/spanning-tree-and-minimum-spanning-tree**
**https://techiedelight.quora.com/500-Data-Structures-and-Algorithms-interview-questions-and-their-solutions**

**Creating array of objects,** 
First array should be initialized
And then, each object should be again initialized:
LinkedList<Integer>[] adjLists = = new LinkedList[n];
for (int i = 0; i < n; i++)
    adjLists[i] = new LinkedList<Integer>();

Hierarchy
module
    packages
        java files

# compile and generate .class file(bytecode). This bytecode can be # run in any device

javac Demo.java

# run the bytecode

java Demo

# To generate the .class file in a different directory

javac -d . Demo.java # same directory
javac -d .. Demo.java # previous directory

# get where a executable file is located

where javac # /usr/bin/javac

# list the directory

ls /usr/bin

# filter for javac

ls /usr/bin | grep javac

# open the bin(binary) folder

open /usr/bin

# another way to run java files

/usr/bin/javac Demo.java

# Path environment variable

echo $PATH

# list all folders and files with hidden ones too

ls -a

# Note: paths are stored in files like .zhrc .zprofile

cd
ls -a
cat .zprofile

Note: if file name is Demo.java, it cannot contain public classes which are not
public class Demo

But Demo class need not be public to be able to run

# Note: package is the folder in which your java file lies
We can use packages to give access to the class to specific packages or restrict access to specific packages

# Note: For input.nextInt() and also other scanner inputs, you can give input as space separated
eg:
int num3 = input.nextInt();
int num4 = input.nextInt();
System.out.println("product: "+(num3*num4)); 
Output:
2 4
product: 8

## Imp Note: floating number cannot be given to int/float using nextInt().
## if integer is assigned to float using nextInt() or nextFloat() it will be stored as float
## if floating number is assigned via nextFloat()
## int num3 = input.nextFloat(); this statement itself will give error
# error when floating number is assigned to int using nextInt() because of nextInt()
int num3 = input.nextInt(); // 2 4.2
int num4 = input.nextInt();
System.out.println("product: "+(num3*num4)); 

# no error when int number is assigned to float using nextInt(). Also error if floating number is given to nextInt()
float num3 = input.nextInt(); // 2 4
float num4 = input.nextInt();
System.out.println("product: "+(num3*num4)); //8.0

# no error when floating/integer number is assigned to float using nextFloat()
float num3 = input.nextFloat(); // 2 4.2   and also for 2 4 : no error
float num4 = input.nextFloat();
System.out.println("product: "+(num3*num4)); // 8.4 or 8.0

# Note: you cannot assign incompatible types
eg: float n1 = input.nextFloat(); // 'a' - gives error

# type casting from top to bottom
float b = 3.4;
int a = b; //error
int a = (int) 4.3f; //float to int
int a = (int) 4.3; // double to int

int a =257;
byte b=a; // error
byte b = (int) a; 
sout(b); //67 bcoz byte can store max value of 256

# final keyword
final variable - to create constant variable
final method - prevent method overriding
final class - prevent inheritance, to create immutable class

**Note**: Immutable class example is String class(objects of String are immutable which means a constant and cannot be changed once created.). 
One can not make a class immutable without making it final.

As we all know that a final variable cannot be re-assign. But in the case of a reference final variable, 
the internal state of the object pointed by that reference variable can be changed. Note that this is not re-assigning. \
This property of final is called non-transitivity
eg.
final StringBuilder sb = new StringBuilder("Geeks");
System.out.println(sb); // Geeks
sb.append("ForGeeks");
System.out.println(sb); // GeeksForGeeks


Arrays
int[] arr = {1,2,3,4};
int[] arr = new int[5];
1. Array objects are in heap.
2. Heap objects are not contiguously allocated.
3. arrays are dynamically allocated in memory. 
Hence, arrays in Java may or may not be contiguous, unlike C or C++. It depends on the JVM. 

int[] arr = {1,2,3,4}; // even here also space is allocated dynamically
int n = arr.length; //4

Note: There is no concept of pointers in java
Note: primitives and arrays of primitives are stored in stack-> int, char, bool, float. But their values are stored in heap. 


new keyword is used to create an object.

s.o.p(arr[0]); //1

String[] str = new String[4]; // [null,null,null,null]
s.o.p(str[0]); // null

Note: null is a special value and it can be assigned to any reference variable except for primitive datatypes.


import java.util.Scanner;

Scanner in = new Scanner(System.in);

// input using for loop
for(int i=0; i < arr.length; i++){
    arr[i] = in.nextInt();
}

# printing using toString(). Easiest way to print
System.out.println(Arrays.toString(arr)); # [1, 2, 3, 4, 5] => String

# Arrays.toString() always prints arrays and it prints them like array only too.
char[] ch = st.toCharArray();
System.out.println(ch); // this is chararray -> Normal toString()
System.out.println(Arrays.toString(ch)); // [t, h, i, s,  , i, s,  , c, h, a, r, a, r, r, a, y] -> Arrays.toString()


#printing elements using for each
for(int num: arr){
   System.out.print(num+"");
}


Array of objects

import java.util.Arrays;
String[] str = new String[4];

for(int i=0; i< str.length; i++){
    str[i] = in.next();
}
  
System.out.println(Arrays.toString(str));

Output:
  aa bb cc dd
  [aa, bb, cc, dd]


Modifying array from another method
import java.util.Arrays;
public class PassinginFunctions{
    public static void main(String[]args){
            int[] nums={3,4,5,12};

            System.out.println(Arrays.toString(nums));

            change(nums);
 
            System.out.println(Arrays.toString(nums));
   }
   static void change(int[]arr){
            arr[0]=99;
   }
}

Output:
[3,4,5,12]
[99,4,5,12]


Multidimensional arrays
int[][] arr=new int[3][]; #number of rows is mandatory. number of Columns is not mandatory. Because each row can have different number of columns. This is because each array is different object.

int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
	};

int[][] arr={
        {1,2,3},
        {4,5},
        {6,7,8,9}
};



int[][] arr = new int[3][2];
System.out.println(arr.length);// no of rows -> 3

for(int row=0; row < arr.length; row++){
    for(int col=0; col < arr[row].length; col++){
        arr[row][col]=in.nextInt();
    }
}


for(int[] a: arr){
    System.out.println(Arrays.toString(a));
}

Or 

int[][]arr={
	  {1,2,3,4},
        {5,6},
        {7,8,9}
};
for(int row=0; row < arr.length; row ++){
    for(int col=0; col < arr[row].length; col++){
        System.out.print(arr[row][col]+"");
    }
    System.out.println();
}

1 2 3 4
5 6
7 8 9

