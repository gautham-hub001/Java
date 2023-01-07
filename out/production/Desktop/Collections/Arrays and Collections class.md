Arrays class - does not work on ArrayList class

import java.util.Arrays;

int[] nums = {1,2,3,4,5};

int index = Arrays.binarySearch(nums, 4); # nums needs to be sorted. 3 is returned

int[] nums = {2,35,40,1,2,3,4,5};
Integer[] nums = {2,35,40,1,2,3,4,5}; #works on this too

Arrays.sort(nums);
Arrays.sort(nums, 2, 5); # from index, to index

Arrays.fill(nums, 0); #fills the entire array with this value. {0,0,0,0,0,0,0,0}


Collections class - min, max, count, sort

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

List<Integer> list = new ArrayList<>();
list.add(34);
list.add(12);
list.add(9);
list.add(9);
list.add(76);
list.add(29);
list.add(75);

sop(Collections.min(list)); # 9
Collections.max(list) # 76
Collections.frequency(list, 9) # 2
Collections.sort(list)
Collections.sort(list, Comparator.reverseOrder())


Sorting custom class

import java.util.Objects; 

public class Student implements Comparable<Student>{
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    @Override
    public String toString(){
        return "Student{" +
            "name='" + name + '\'' +
            ", rollNo=" + rollNo +
            '}';
    }

    @Override
    public boolean equals(Object o){ // to check if two objects are equal or not
       if(this == o) return true; // if two objects are same, then true
       if(o == null || getClass() != o.getClass()) return false; // if one of them is null, then false
       Student student = (Student) o; 
       return rollNo == student.rollNo; // if both have same rollNo, then true
    }

    @Override
    public int hashCode(){
       return Objects.hash(rollNo); # hashCode is only generated based on rollNo. So, if 2 objects have same rollNo, then same hashCode is generated
    }

    ******* for comparing current student with a passed student object using rollNo. This is used by Collections.sort() and if Positive -> current student(this) is higher. negative -> that is higher. 0 -> both are same *****
    @Override
    public int compareTo(Student that) {
	return this.rollNo - that.rollNo;
    }

    ******* for comparing using name. compareTo is already available for String object *****
    @Override
    public int compareTo(Student that) {
	return this.name.compareTo(that.name);
    }    
}



Student s1 = new Student("Anuj", 2));
Student s2 = new Student("Rohit", 3));

sop(s1.compareTo(s2)); # 2-3 -> -1 is returned

List<Student> list = new ArrayList<>();

list.add(new Student("Anuj", 2));
list.add(new Student("Ramesh", 4));
list.add(new Student("Shivam", 3));
list.add(new Student("Rohit", 1));

Collections.sort(list); 

// you can directly write the comparator here (compare)
Collections.sort(list, new Comparator<Student>() {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
    	}
}); 

// using lambda
Collections.sort(list, (o1, o2) -> o1.rollNo - o2.rollNo); 
