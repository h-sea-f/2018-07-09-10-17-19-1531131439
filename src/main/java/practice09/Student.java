package practice09;

public class Student extends Person{
    protected Klass klass;

    public Klass getKlass() {
        return klass;
    }
    public Student(int id,String name,int age,Klass klass){
        this.name=name;
        this.age=age;
        this.klass=klass;
        this.id=id;
    }
    public String introduce(){
        if(klass.getLeader()!=null&&klass.getLeader().id==id){
            return super.introduce()+" I am a Student."+" I am Leader of Class "+klass.getNumber()+".";
        }
        else return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
    }
}
