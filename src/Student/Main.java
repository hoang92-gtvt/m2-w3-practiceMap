package Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);//in ra thu 1
        studentMap.put(2, student2);//in ra thu 2
        studentMap.put(3, student3);//in ra thu 3
        studentMap.put(4, student1);//in ra thu 4

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("........................HashSet");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);// in ra thu 1
        students.add(student2); // in ra thu 2
        students.add(student3);// in ra thu 3
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }


        System.out.println("........................LinkedHashSet");
        Set<Student> students2 = new LinkedHashSet<Student>();
        students2.add(student1);// in ra thu 1
        students2.add(student2); // in ra thu 2
        students2.add(student3);// in ra thu 3
        students2.add(student1);

        for (Student student : students2) {
            System.out.println(student.toString());
        }
    }
}
