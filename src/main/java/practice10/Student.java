package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this != klass.getLeader()) {
            return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
        }
        else return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), klass.getDisplayName());
    }

    public boolean isIn(Teacher teacher){
        for (Klass k : teacher.getClassList()){
            if (k == this.getKlass()){
                return true;
            }
        }
        return false;
    }

}
