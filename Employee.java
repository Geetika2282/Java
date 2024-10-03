import java.util.Set;

public class Employee {
    private int empid;
    private String name;
    private double salary;
    private Set<String> skillset;

    public Employee(int empid, String name, int i1, Set<String> skillset) {
    }

    public int getEmpid(){
        return empid;
    }

    public void setEmpid(int empid){
        this.empid = empid;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
