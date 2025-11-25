public class School extends Learner {

    private Olimpiada olimpiada;
    private Lessons lessons;


    //Конструкторы

    public School(){
        super();
        this.olimpiada = null;
        this.lessons = null;
    }

    public School(String name, String sex, int age, Olimpiada olimpiada, Lessons lessons){
        super(name, sex, age);
        this.olimpiada = olimpiada;
        this.lessons = lessons;
    }

    public School(School other){
        super(other.getName(), other.getSex(), other.getAge());
        this.olimpiada = other.olimpiada;
        this.lessons = other.lessons;
    }

    //Геттеры

    public Lessons getLessons() {
        return lessons;
    }

    public Olimpiada getOlimpiada() {
        return olimpiada;
    }

    //Сеттеры

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }

    public void setOlimpiada(Olimpiada olimpiada) {
        this.olimpiada = olimpiada;
    }

    //Стипендия

    public boolean schoolStip(){
        if (olimpiada.condition() && lessons.checkGrades() && lessons.coolCheck()){
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
        for (int i = 1; i <= 17; i++){
            if (lessons.getGrades().get(i) != null && lessons.getGrades().get(i) != 0){
                System.out.println("    " + lessons.getNames().get(i) + ": " + lessons.getGrades().get(i));
            }
        }
        System.out.println("Места на олимпиадах: ");
        System.out.println("    Школьная: " + olimpiada.getSchool());
        System.out.println("    Городская: " + olimpiada.getCity());
        System.out.println("    Областная: " + olimpiada.getRegion());
        System.out.println("==================================================");
    }
}
