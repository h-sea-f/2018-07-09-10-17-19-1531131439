package practice04;

public class Worker extends Person{
    public Worker(String name,int age){
        this.age=age;
        this.name=name;
    }
    public Worker(){}
    public String introduce(){
        return "My name is "+name+". I am "+age+" years old. "+"I am a Worker. I have a job.";
    }
}
