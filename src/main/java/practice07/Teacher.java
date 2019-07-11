package practice07;

public class Teacher extends Person {
    protected Klass klass;

    public Klass getKlass() {
        return klass;
    }
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Teacher(String name,int age,Klass klass){
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public String introduce(){
        if(this.klass==null) return super.introduce()+" I am a Teacher. I teach No Class.";
        else return super.introduce()+" I am a Teacher. I teach Class "+klass.getKlass()+".";
    }
    public String introduceWith(Student student){
        if(klass.getKlass()==student.getKlass().getKlass()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
