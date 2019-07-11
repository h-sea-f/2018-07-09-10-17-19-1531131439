package practice05;

public class Student extends Person{
    protected int klass;

    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass){
        this.klass=klass;
        this.age=age;
        this.name=name;
    }
    public Student(){}
    public String introduce(){
        return "My name is "+name+". I am "+age+" years old. "+"I am a Student. I am at Class "+klass+".";
    }
}
