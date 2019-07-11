package practice03;

public class Worker extends Person{
    public Worker(String name,int age){
        this.age=age;
        this.name=name;
    }
    public Worker(){}
    public String introduce(){
        return "I am a Worker. I have a job.";
    }
}
