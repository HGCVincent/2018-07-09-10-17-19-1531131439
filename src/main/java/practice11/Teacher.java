package practice11;

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
        for (Klass klass : classList){
            klass.attach(this);
        }
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

    public void printMesWhenStudentJoinClass(Student student,String classDisplayName) {
        System.out.print(String.format("I am %s. I know %s has joined %s.\n",this.getName(),student.getName(),classDisplayName));
    }

    public void printMesWhenStudentAssignLeader(Student student,String classDisplayName) {
        System.out.print(String.format("I am %s. I know %s become Leader of %s.\n",this.getName(),student.getName(),classDisplayName));
    }
}
