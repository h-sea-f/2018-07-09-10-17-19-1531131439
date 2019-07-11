package practice11;

public class Person {
    protected int id;
    protected String name;
    protected int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Person(){}
    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }
    public boolean equals(Object obj){
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if(person.id==this.id)return true;
            else return false;
        }
        return false;
    }
}
