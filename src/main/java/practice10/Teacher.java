package practice10;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes = new ArrayList<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> classList) {
        super(id, name, age);
        this.classes = classList;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (classes.size() > 0) {
            return String.format("%s I am a Teacher. I teach Class 2, 3.", super.introduce(), classes.toString());
        } else return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student student){
        if (isTeaching(student)){
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),student.getName());
        }else return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),student.getName());
    }

    public boolean isTeaching(Student student){
        return student.isIn(this);
    }
}
