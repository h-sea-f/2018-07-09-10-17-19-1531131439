package practice02;

public class Student extends Person {
    protected int klass;

    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass){
        this.klass=klass;
        this.age=age;
        this.name=name;
    }
    public String introduce(){
        return "I am a Student. I am at Class "+klass+".";
    }
}
