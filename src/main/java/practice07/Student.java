package practice07;

public class Student extends Person {
    protected Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age, Klass klass){
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+klass.getKlass()+".";
    }
}
