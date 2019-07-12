package practice11;
import java.util.ArrayList;
import java.util.List;
public class Klass {
    protected int number;
    protected Student leader;
    protected List<Student> studentList=new ArrayList<Student>();
    protected Teacher teacher;
    public Student getLeader() {
        return leader;
    }
    public void assignLeader(Student leader){
        if(this.studentList.contains(leader)){
            this.leader=leader;
            if(this.teacher!=null){
                teacher.printLeader(this,leader);
            }

        }
        else System.out.print("It is not one of us.\n");

    }
    public int getNumber() {
        return number;
    }
    public Klass(int number){
        this.number=number;
    }
    public String getDisplayName(){
        return "Class "+number;
    }
    public void appendMember(Student student){

        this.studentList.add(student);
        if(this.teacher!=null){
            this.teacher.printaddStudent(this,student);
        }


    }
    public boolean isIn(Student student){
        if(this.studentList.contains(student)) return true;
        else return false;
    }
}
