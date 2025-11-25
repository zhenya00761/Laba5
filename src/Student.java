import java.util.ArrayList;
import java.util.List;

public class Student extends Learner{

    private int kyrs;
    private List<Subject> subjects = new ArrayList<>();

    //Коснтрукторы

    public Student(){
        super();
        this.kyrs = 0;
        this.subjects = null;
    }

    public Student(String name, String sex, int age, int kyrs, List<Subject> subjects){
        super(name, sex, age);
        this.kyrs = kyrs;
        this.subjects = subjects;
    }

    public int getKyrs() {
        return kyrs;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setKyrs(int kyrs) {
        this.kyrs = kyrs;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    private double averageSubj(){

        double sum = 0;
        for (Subject sub: subjects){
            sum += sub.getGrade();
        }
        return Math.round(sum / subjects.size() * 100.0) / 100.0;
    }

    public boolean checkStip(){
        if (kyrs == 5 && averageSubj() > 4.75){
            return true;
        }
        return false;
    }

    @Override
    public void infoAll(){
        System.out.println("Имя: " + this.getName());
        System.out.println("Пол: " + this.getSex());
        System.out.println("Возраст: " + this.getAge());
        System.out.println("Оценки за предметы: ");
        for (Subject subject: subjects){
            System.out.println("    " + subject.getNameSubject() + ": " + subject.getGrade());
        }
        System.out.println("Оценка за курсовые: " + this.getKyrs());
        System.out.println("========================================");
    }
}
