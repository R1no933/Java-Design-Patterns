package patterns.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Dmitriy");
        empList.add("Sashe");
        empList.add("Andrey");
        empList.add("Lena");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tmp = new ArrayList<String>();
        for (String employeer : this.getEmpList()) {
            tmp.add(employeer);
        }

        return new Employees(tmp);
    }
}
