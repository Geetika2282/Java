import java.util.Arrays;

public class Oop1 {
    // class is a template of an object
    // object - instance of the class
    // Object - State of object, behaviour of object, identity of object

    public static void main(String[] args) {
        Student s1; // reference to Student type
        Student[] s2 = new Student[5]; // new Student: memory allocated at runtime
        Student s3 = new Student();
        System.out.println(s3.marks);
        Student geet;
        System.out.println(Arrays.toString(s2));

    }
}

class Student
{
        int rollNo;
        String names;
        float marks;

        void Student(int rollNo, String names, float marks){


        }

}

