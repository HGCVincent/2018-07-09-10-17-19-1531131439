package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass != 0) {
            return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass);
        } else return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }
}
