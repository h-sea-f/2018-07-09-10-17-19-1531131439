package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    protected List<Klass> classes=new LinkedList<Klass>();
    private String classNumer="";
    public List<Klass> getClasses() {
        return classes;
    }
    public Teacher(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Teacher(int id,String name,int age,List<Klass> classes){
        this.name=name;
        this.age=age;
        this.classes=classes;
        this.id=id;
    }
    public String introduce(){
        for(int i=0;i<classes.size();i++){
            if(i!=classes.size()-1) classNumer+=classes.get(i).getNumber()+", ";
            else classNumer+=classes.get(i).getNumber();
        }
        if(this.classes.size()==0) return super.introduce()+" I am a Teacher. I teach No Class.";
        else return super.introduce()+" I am a Teacher. I teach Class "+classNumer+".";
    }
    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
    public boolean isTeaching(Student student){
        boolean flag=false;
        for(int i=0;i<classes.size();i++){
            if(classes.get(i).number==student.klass.number) flag=true;
        }
        return flag;
    }

}
