import java.util.Set;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String name;
    private double salary;
    private Set<String> skillset;


    public Employee(int empID, String name, double salary, Set<String> skillset){
        super();
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.skillset = skillset;
    }

    public int getEmpID(){
        return empID;
    }

    public void setEmpID(int empID){
        this.empID = empID;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public Set<String> getSkillset(){
        return skillset;
    }

    public void setSkillset(Set<String> skillset){
        this.skillset = skillset;
    }

    @Override
    public String toString(){
        return "Employee [empid=" + empID + ", name= "+ name +", salary= "+salary+", skillSet= " + skillset;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.empID < o.empID)
            return -1;
        else {
            return 1;
        }
    }

    public String getName() {
        return name;
    }
}
