// day1: package name


//roll.java
package day1;

public class roll {
    public static void main(String[] args) {

        // creating an object with new keyword everytime
        Student s1 = new Student("Geetika");
        Student s2 = new Student("Alisha");
        Student s3 = new Student("Naina");
        Student s4 = new Student("Yasha");
    }
}


//Student.java
package day1;

public class Student {
    static int rollNo = 0;

    public Student(String name) {
        rollNo++;
        System.out.println(rollNo + " " + name);
    }
}
