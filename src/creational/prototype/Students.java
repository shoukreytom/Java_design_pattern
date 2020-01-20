package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {

    private List<String> students;

    public Students() {
        students = new ArrayList<>();
    }

    public Students(List<String> students) {
        this.students = students;
    }

    public List<String> getStudents() {
        return students;
    }

    public Students reload() {
        students.add("Shoukrey Tom");
        students.add("Mohamed Mubarak");
        students.add("Mohamed Hamid");
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        for(String s : students) {
            list.add(s);
        }
        return new Students(list);
    }
}
