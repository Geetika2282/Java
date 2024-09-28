
import java.util.*;

public class EmployeeCollection {

    public List <Employee> initializeEmployeedata(){
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C++");
        emplist.add(new Employee(567,"aaa",75000,skills1));
        Set<String> skills2 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C++");
        emplist.add(new Employee(123,"sss",70000,skills2));
        Set<String> skills3 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C++");
        emplist.add(new Employee(890,"ppp",50000,skills3));
        Set<String> skills4 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C++");
        emplist.add(new Employee(334,"mmm",80000,skills4));
        Set<String> skills5 = new TreeSet<>();
        skills1.add("java");
        skills1.add("C++");
        emplist.add(new Employee(567,"aaa",75000,skills1));

        return emplist;
    }
    public void printList(List<Employee> emplist){
        for(Employee e : emplist){
            System.out.println(e);
        }
    }
    public Employee searchEmployee(List<Employee> emplist,int empid){
        for(Employee e: emplist){
            if(e.getEmpID() == empid){
                return e;
            }
        }
        return null;
    }
    public List<Employee> filterEmployees(List<Employee> emplist,String criteria)
    {
        List<Employee> filtered = new ArrayList<>();
        for (Employee e : emplist){
            if(e.getSkillset().contains(criteria))
            {
                filtered.add(e);
            }
        }
        return filtered;
    }

    public Map<Integer, Double> salaryMap(List<Employee> empList)
    {
        Map<Integer, Double>salmap = new TreeMap<>();
        for(Employee e: empList)
        {
            salmap.put(e.getEmpID(), e.getSalary());
        }
        return salmap;
    }

    public static void main(String[] args) {
        EmployeeCollection e = new EmployeeCollection();
        List<Employee> empList = e.initializeEmployeedata();
        e.printList(empList);
        Employee found = e.searchEmployee(empList, 123);
        System.out.println("Employee data: " + found);
        List<Employee> bySkill = e.filterEmployees(empList, "Java");
        e.printList(bySkill);
//
//        System.out.println("----Employee Salary Mapping----");
//        Map<Integer, Double> salmap = e.salaryMap(empList);
//        for(Entry<Integer,Double> entry:salmap.entrySet()){
//            System.out.println(entry.getKey()+"---->"+entry.getValue());
//        }

        System.out.println("-----------Sort by employee--------------");
        Collections.sort(empList);
        e.printList(empList);
        int index = Collections.binarySearch(empList,new Employee(123,null,0,null));
        System.out.println("Found at index: "+index);

        System.out.println("------------Sort by Employee Name-----------");
        Collections.sort(empList,new NameComparator());
        e.printList(empList);
        index = Collections.binarySearch(empList,new Employee(0,"sss",0,null),new NameComparator());
        System.out.println("Found at index: "+index);

//        System.out.println("------------Sort by employee Salary------------");
//        Collections.sort(empList,new Salary);


    }
}