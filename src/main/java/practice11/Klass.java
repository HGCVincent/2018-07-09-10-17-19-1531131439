package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<Student>();
    private List<Teacher> teachers = new ArrayList<>();

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
        else {
            this.leader = student;
            notifyAllTeachers(student,2);
        }
    }

    public void appendMember(Student student){
        studentList.add(student);
        notifyAllTeachers(student,1);
    }

    public void attach(Teacher teacher){
        teachers.add(teacher);
    }

    public void notifyAllTeachers(Student student,int event){
        for (Teacher teacher : teachers){
            if (event == 1) {
                teacher.printMesWhenStudentJoinClass(student, this.getDisplayName());
            }
            if (event == 2){
                teacher.printMesWhenStudentAssignLeader(student,this.getDisplayName());
            }
        }
    }
}
