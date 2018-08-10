package example;

import java.util.LinkedList;

/**
 * Created by expertzlab12 on 7/5/18.
 */
public class Employee {

    /**
     * Created by expertzlab12 on 7/5/18.
     */
        public Employee(String empname,float salary,String dept)
        {
            this.empname=empname;
            this.salary=salary;
            this.dept=dept;
        }
        String empname;
        float salary;
        String dept;

        public static void main(String[] args) {
            LinkedList<Employee> list=new LinkedList<>();
            Employee emp=new Employee("abc",20000,"clerk");
            Employee emp1=new Employee("xyz",50000,"supervisor");
            list.add(emp);
            list.add(emp1);
            for (Employee a:list) {
                System.out.println(a.dept+" "+a.empname+" "+a.salary);

            }
        }
    }

