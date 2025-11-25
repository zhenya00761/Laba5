public class Learner {

    private String name;
    private String sex;
    private int age;

    // Конструкторы

    public Learner(){
        this.name = "";
        this.sex = "";
        this.age = 0;
    }

    public Learner(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Learner(Learner other){
        this.name = other.name;
        this.sex = other.sex;
        this.age = other.age;
    }

    //Геттеры

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    //Сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        if (sex == "male" || sex == "female")
            this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void infoAll(){
        System.out.println("Имя: " + this.getName());
        System.out.println("Пол: " + this.getSex());
        System.out.println("Возраст: " + this.getAge());
        System.out.println("================================");
    }

}
