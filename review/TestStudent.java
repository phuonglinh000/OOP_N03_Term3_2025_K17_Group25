// package review;

// import java.util.Set;
// import java.util.TreeSet;
// import java.util.Iterator;

// public class TestStudent {
//     public static void main(String[] args) {
//         Student s1 = new Student("Fred", 3.0F);
//         Student s2 = new Student("Sam", 3.5F);
//         Student s3 = new Student("Steve", 2.1F);

//         if (s3.compareTo(s2) < 0)
//             System.out.println(s3.getName() + " has a lower gpa than " + s2.getName());

//         Set<Student> studentSet = new TreeSet<>();
//         studentSet.add(s1);
//         studentSet.add(s2);
//         studentSet.add(s3);

//         Iterator<Student> i = studentSet.iterator();
//         while (i.hasNext())
//             System.out.println(i.next().getName());
//     }
// }
