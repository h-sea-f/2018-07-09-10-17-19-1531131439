package practice08;

public class Klass {
    protected int klass;
    private Student leader;

    public Student getLeader() {
        return leader;
    }
    public void assignLeader(Student leader){
        this.leader=leader;
    }
    public int getKlass() {
        return klass;
    }
    public Klass(int klass){
        this.klass=klass;
    }
    public int getNumber(){
        return klass;
    }
    public String getDisplayName(){
        return "Class "+klass;
    }
}
