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

        Student.displayStudentCount();       

    }
}


//Student.java
package day1;

public class Student {
    private int rollNo = 0;
    private String name;

    private static int count=0;


    public Student(String name) {
        this.name = name;
        this.rollNo = ++count;
        System.out.println(rollNo + " " + name);
    }

    public String toString(){
        rollNo++;
        return "Student roll no:" +rollNo + "Name: "+name + ": "+name;
    }
    public static void displayStudentCount(){
        System.out.println("Total students: "+count);
    }
}
