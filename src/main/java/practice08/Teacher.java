package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
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
        if (klass != null) {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klass.getDisplayName());
        } else return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student student){
        if (this.klass == student.getKlass()){
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),student.getName());
        }else return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),student.getName());
    }
}
