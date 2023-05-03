Array list vs linked list
https://www.javatpoint.com/difference-between-arraylist-and-linkedlist


Hashing is used in HashSet, HashMap, TreeMap

ArrayList or LinkedList
import java.util.List;
import java.util.ArrayList;
List<Integer> l = new ArrayList<Integer>();
List<Integer> l = new ArrayList<>();
List<Integer> l2 = new ArrayList();

.add(10)
addAll(l2)
remove(1) # index
remove(Integer.valueOf(30))

get(1) 
set(2, 20)

contains(10)
size()

iterator()

Iterator i = l.iterator();
i.hasNext()
i.next()

while(it.hasNext()) {
  System.out.println(it.next());
}


Stack
Stack<String> l = new Stack<>();

.push("adgs") or push("A")
pop()
peek()
empty()



Implementing Queue using linked list
Queue<Integer> q = new LinkedList<>();

q.offer(10); //like add but returns false if element couldn't be added to the queue
poll(); // deletes and returns front element
peek(); // returns front element. Returns null if empty

add(12); //not used bcoz returns exception if couldn't be added to the queue
remove(2); // deletes and returns front element but returns exception if can't be done
element(); // returns front element. Exception if empty



Priority Queue. -> need not store elements in ascending order. 
Queue<Integer> pq = new PriorityQueue <>();

pq.offer(10)
poll()
peek() // returns smallest element in the queue. 

add()
remove
element

import java.util.Comparator;
Queue<Integer> pq = new PriorityQueue <>(Comparator.reverseOrder());


ArrayDeque
ArrayDeque<Integer> adq = new ArrayDeque<>();

adq.offer(23)
offerFirst(12); #adds in front
offerLast(10); # same as offer

Similarly 
Poll, pollFirst, pollLast
peek, peekFirst, peekLast


HashSet, LinkedHashSet
Set<Integer> set = new HashSet<>(); # uses hashing. Has random order. Unique elements. Operations are O(1)
Set<Integer> set = new LinkedHashSet <>(); # Has same order as it was added
Set<Integer> set = new TreeSet <>(); #also has BST properties. So, elements are sorted. Operations are O(logN)

set.add(10);
remove(40)
contains(29)
isEmpty()
size()
clear()



*** Custom Object ***
import java.util.Objects;
 
public class Student{
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
}

Set<Student> studentSet = new HashSet<>();
studentSet.add(new Student("raju", 10));
studentSet.add(new Student("ram", 20));

sop(studentSet);

Output:
[Student{name='raju', rollNo=10}, Student{name='ram', rollNo=20}]


Student s1 = new Student("raju", 10);
Student s2 = new Student("Anuj", 10);

sop(s1.equals(s2)); //true


Map
Map<String, Integer> nums = new HashMap<>();
Map<String, Integer> nums = new TreeMap<>(); # sorts based on keys. O(logN)

nums.put("One", 1) # {One=1, Two=2.....}
.put("One",2) #overrides previous value of one bcoz. {One=2}

remove("Three")

if(!nuts.containsKey("One")) { #similarly containsValue(2)
	nums.put("One", 2);
}
Or
.putIfAbsent("One", 2)

for(Map.Entry<String, Integer> e: nums.entrySet()){
	sop(e) #One=1
	or
	sop(e.getKey()) #One
	sop(e.getValue()) #1
}

Or

for(String key: nums.keySet()) {
	sop(key)
}

for(Integer value: nums.values()) {
	sop(value)
}

HashTable also has same methods as HashMap:
HashTable<Integer, Integer> ht = new HashTable<>();
ht.put(1,2)
.putIfAbsent(1,5);
.remove(1)
.contains(value)
.containsKey(key)
.containsValue(value)
.entrySet() keySet() values()
.equals()
.
