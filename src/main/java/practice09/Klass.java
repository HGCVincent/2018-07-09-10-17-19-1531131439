package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<Student>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return String.format("Class %d",number);
    }

    public void assignLeader(Student student){
        if (!studentList.contains(student)){
            System.out.print("It is not one of us.\n");
        }
        else this.leader = student;
    }

    public void appendMember(Student student){
        studentList.add(student);
    }
}
