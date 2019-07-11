package practice10;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classList = new ArrayList<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> classList) {
        super(id, name, age);
        this.classList = classList;
    }

    public List<Klass> getClassList() {
        return classList;
    }

    public void setClassList(List<Klass> classList) {
        this.classList = classList;
    }

    @Override
    public String introduce() {
        if (classList.size() > 0) {
            return String.format("%s I am a Teacher. I teach Class 2, 3.", super.introduce(), classList.toString());
        } else return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public boolean isTeaching(Student student){
        return student.isIn(this);
    }
}
