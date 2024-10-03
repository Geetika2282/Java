import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeStream {

    public class EmployeeCollection {

        public List<Employee> initializeEmployeedata() {
            List<Employee> emplist = new ArrayList<>();
            Set<String> skills1 = new TreeSet<>();
            skills1.add("java");
            skills1.add("C++");
            emplist.add(new Employee(567, "aaa", 75000, skills1));
            Set<String> skills2 = new TreeSet<>();
            skills1.add("java");
            skills1.add("C++");
            emplist.add(new Employee(123, "sss", 70000, skills2));
            Set<String> skills3 = new TreeSet<>();
            skills1.add("java");
            skills1.add("C++");
            emplist.add(new Employee(890, "ppp", 50000, skills3));
            Set<String> skills4 = new TreeSet<>();
            skills1.add("java");
            skills1.add("C++");
            emplist.add(new Employee(334, "mmm", 80000, skills4));
            Set<String> skills5 = new TreeSet<>();
            skills1.add("java");
            skills1.add("C++");
            emplist.add(new Employee(567, "aaa", 75000, skills1));

            return emplist;
        }

        public static void main(String[] args) {


        }
    }
}
