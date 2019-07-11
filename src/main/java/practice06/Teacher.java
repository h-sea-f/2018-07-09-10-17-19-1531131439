package practice06;

public class Teacher extends Person {
    protected int klass;
    public int getKlass() {
        return klass;
    }
    public Teacher(String name,int age,int klass){
        this.klass=klass;
        this.name=name;
        this.age=age;
    }
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String introduce(){
        if(this.klass==0) return "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
        else return "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+klass+".";
    }

}
