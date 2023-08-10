package patterns.creational_patterns.prototype;

import java.util.List;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees firstNewEmps = (Employees) emps.clone();
        Employees secondNewEmps = (Employees) emps.clone();
        List<String> list = firstNewEmps.getEmpList();
        list.add("Kirill");
        List<String> secondList = secondNewEmps.getEmpList();
        secondList.remove("Lena");

        System.out.println("Emps list is: " + emps.getEmpList());
        System.out.println("List is: " + list);
        System.out.println("Second list is: " + secondList);
    }
}
