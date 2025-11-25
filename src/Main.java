import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ШКОЛЬНИКИ
        List<School> students = new ArrayList<>();

        // 1. Иван - отличник с победами в олимпиадах
        Map<Integer, Integer> ivanGrades = new HashMap<>();
        ivanGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        ivanGrades.put(Lessons.LITERATURE, 5);
        ivanGrades.put(Lessons.ALGEBRA, 5);
        ivanGrades.put(Lessons.GEOMETRY, 5);
        ivanGrades.put(Lessons.INFORMATICS, 5);
        ivanGrades.put(Lessons.HISTORY, 5);
        ivanGrades.put(Lessons.SOCIAL_STUDIES, 5);
        ivanGrades.put(Lessons.GEOGRAPHY, 5);
        ivanGrades.put(Lessons.BIOLOGY, 5);
        ivanGrades.put(Lessons.PHYSICS, 5);
        ivanGrades.put(Lessons.CHEMISTRY, 5);
        ivanGrades.put(Lessons.FOREIGN_LANGUAGE, 5);
        ivanGrades.put(Lessons.MATH, 5);

        students.add(new School("Иван Петров", "male", 16,
                new Olimpiada(1, 2, 1), new Lessons(ivanGrades)));

        // 2. Мария - хорошистка с призовыми местами
        Map<Integer, Integer> mariaGrades = new HashMap<>();
        mariaGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        mariaGrades.put(Lessons.LITERATURE, 5);
        mariaGrades.put(Lessons.ALGEBRA, 4);
        mariaGrades.put(Lessons.GEOMETRY, 4);
        mariaGrades.put(Lessons.INFORMATICS, 5);
        mariaGrades.put(Lessons.HISTORY, 5);
        mariaGrades.put(Lessons.BIOLOGY, 5);
        mariaGrades.put(Lessons.CHEMISTRY, 5);
        mariaGrades.put(Lessons.FOREIGN_LANGUAGE, 5);
        mariaGrades.put(Lessons.MATH, 4);

        students.add(new School("Мария Сидорова", "female", 15,
                new Olimpiada(1, 3, 0), new Lessons(mariaGrades)));

        // 3. Алексей - троечник без олимпиад
        Map<Integer, Integer> alexeyGrades = new HashMap<>();
        alexeyGrades.put(Lessons.RUSSIAN_LANGUAGE, 3);
        alexeyGrades.put(Lessons.ALGEBRA, 3);
        alexeyGrades.put(Lessons.GEOMETRY, 3);
        alexeyGrades.put(Lessons.HISTORY, 4);
        alexeyGrades.put(Lessons.PHYSICAL_EDUCATION, 5);
        alexeyGrades.put(Lessons.MATH, 3);

        students.add(new School("Алексей Козлов", "male", 17,
                new Olimpiada(0, 0, 0), new Lessons(alexeyGrades)));

        // 4. Екатерина - отличница по гуманитарным предметам
        Map<Integer, Integer> ekaterinaGrades = new HashMap<>();
        ekaterinaGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        ekaterinaGrades.put(Lessons.LITERATURE, 5);
        ekaterinaGrades.put(Lessons.HISTORY, 5);
        ekaterinaGrades.put(Lessons.SOCIAL_STUDIES, 5);
        ekaterinaGrades.put(Lessons.GEOGRAPHY, 5);
        ekaterinaGrades.put(Lessons.FOREIGN_LANGUAGE, 5);
        ekaterinaGrades.put(Lessons.ALGEBRA, 4);
        ekaterinaGrades.put(Lessons.MATH, 4);

        students.add(new School("Екатерина Новикова", "female", 16,
                new Olimpiada(1, 1, 2), new Lessons(ekaterinaGrades)));

        // 5. Дмитрий - технарь с победами в математических олимпиадах
        Map<Integer, Integer> dmitryGrades = new HashMap<>();
        dmitryGrades.put(Lessons.ALGEBRA, 5);
        dmitryGrades.put(Lessons.GEOMETRY, 5);
        dmitryGrades.put(Lessons.INFORMATICS, 5);
        dmitryGrades.put(Lessons.PHYSICS, 5);
        dmitryGrades.put(Lessons.MATH, 5);
        dmitryGrades.put(Lessons.RUSSIAN_LANGUAGE, 4);
        dmitryGrades.put(Lessons.LITERATURE, 4);

        students.add(new School("Дмитрий Волков", "male", 17,
                new Olimpiada(1, 1, 1), new Lessons(dmitryGrades)));

        // 6. Анна - всесторонне развитая ученица
        Map<Integer, Integer> annaGrades = new HashMap<>();
        annaGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        annaGrades.put(Lessons.LITERATURE, 5);
        annaGrades.put(Lessons.ALGEBRA, 5);
        annaGrades.put(Lessons.GEOMETRY, 5);
        annaGrades.put(Lessons.HISTORY, 5);
        annaGrades.put(Lessons.BIOLOGY, 5);
        annaGrades.put(Lessons.PHYSICS, 5);
        annaGrades.put(Lessons.CHEMISTRY, 5);
        annaGrades.put(Lessons.FOREIGN_LANGUAGE, 5);
        annaGrades.put(Lessons.ART, 5);
        annaGrades.put(Lessons.MUSIC, 5);
        annaGrades.put(Lessons.PHYSICAL_EDUCATION, 5);
        annaGrades.put(Lessons.MATH, 5);

        students.add(new School("Анна Смирнова", "female", 15,
                new Olimpiada(1, 2, 3), new Lessons(annaGrades)));

        // 7. Сергей - спортсмен с средними оценками
        Map<Integer, Integer> sergeyGrades = new HashMap<>();
        sergeyGrades.put(Lessons.RUSSIAN_LANGUAGE, 4);
        sergeyGrades.put(Lessons.ALGEBRA, 4);
        sergeyGrades.put(Lessons.HISTORY, 4);
        sergeyGrades.put(Lessons.PHYSICAL_EDUCATION, 5);
        sergeyGrades.put(Lessons.TECHNOLOGY, 5);
        sergeyGrades.put(Lessons.MATH, 4);

        students.add(new School("Сергей Попов", "male", 16,
                new Olimpiada(0, 0, 0), new Lessons(sergeyGrades)));

        // 8. Ольга - с проблемами по математике
        Map<Integer, Integer> olgaGrades = new HashMap<>();
        olgaGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        olgaGrades.put(Lessons.LITERATURE, 5);
        olgaGrades.put(Lessons.HISTORY, 5);
        olgaGrades.put(Lessons.GEOGRAPHY, 5);
        olgaGrades.put(Lessons.BIOLOGY, 5);
        olgaGrades.put(Lessons.ALGEBRA, 3);
        olgaGrades.put(Lessons.GEOMETRY, 3);
        olgaGrades.put(Lessons.MATH, 3);

        students.add(new School("Ольга Кузнецова", "female", 16,
                new Olimpiada(1, 0, 0), new Lessons(olgaGrades)));

        // 9. Павел - творческая личность
        Map<Integer, Integer> pavelGrades = new HashMap<>();
        pavelGrades.put(Lessons.RUSSIAN_LANGUAGE, 4);
        pavelGrades.put(Lessons.LITERATURE, 5);
        pavelGrades.put(Lessons.ART, 5);
        pavelGrades.put(Lessons.MUSIC, 5);
        pavelGrades.put(Lessons.HISTORY, 4);
        pavelGrades.put(Lessons.ALGEBRA, 4);
        pavelGrades.put(Lessons.MATH, 4);

        students.add(new School("Павел Орлов", "male", 15,
                new Olimpiada(0, 2, 0), new Lessons(pavelGrades)));

        // 10. Наталья - призер областной олимпиады
        Map<Integer, Integer> natalyaGrades = new HashMap<>();
        natalyaGrades.put(Lessons.RUSSIAN_LANGUAGE, 5);
        natalyaGrades.put(Lessons.LITERATURE, 5);
        natalyaGrades.put(Lessons.ALGEBRA, 5);
        natalyaGrades.put(Lessons.GEOMETRY, 5);
        natalyaGrades.put(Lessons.INFORMATICS, 5);
        natalyaGrades.put(Lessons.HISTORY, 5);
        natalyaGrades.put(Lessons.PHYSICS, 5);
        natalyaGrades.put(Lessons.CHEMISTRY, 5);
        natalyaGrades.put(Lessons.FOREIGN_LANGUAGE, 5);
        natalyaGrades.put(Lessons.MATH, 5);

        students.add(new School("Наталья Васнецова", "female", 17,
                new Olimpiada(1, 1, 2), new Lessons(natalyaGrades)));

        //СТУДЕНТЫ

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Александр Иванов", "male", 21, 5,
                Arrays.asList(
                        new Subject("Математика", 5),
                        new Subject("Физика", 5),
                        new Subject("Программирование", 5),
                        new Subject("Английский язык", 5),
                        new Subject("Философия", 5)
                )
        ));

        studentList.add(new Student("Елена Петрова", "female", 20, 4,
                Arrays.asList(
                        new Subject("Математика", 4),
                        new Subject("Физика", 5),
                        new Subject("Программирование", 5),
                        new Subject("Английский язык", 4),
                        new Subject("Экономика", 4)
                )
        ));

        studentList.add(new Student("Дмитрий Сидоров", "male", 22, 5,
                Arrays.asList(
                        new Subject("Математика", 3),
                        new Subject("Физика", 4),
                        new Subject("Программирование", 3),
                        new Subject("Английский язык", 4),
                        new Subject("История", 3)
                )
        ));

        studentList.add(new Student("Ольга Козлова", "female", 21, 3,
                Arrays.asList(
                        new Subject("Математика", 5),
                        new Subject("Физика", 5),
                        new Subject("Программирование", 5),
                        new Subject("Английский язык", 4),
                        new Subject("Химия", 5)
                )
        ));

        studentList.add(new Student("Михаил Волков", "male", 19, 0,
                Arrays.asList(
                        new Subject("Математика", 4),
                        new Subject("Физика", 4),
                        new Subject("Программирование", 5),
                        new Subject("Английский язык", 4),
                        new Subject("Биология", 5)
                )
        ));


        //1 ЗАДАНИЕ

        System.out.println("1 ЗАДАНИЕ\n");

        for (School student: students){
            if (student.getSex() == "female"){
                if (student.getOlimpiada().getSchool() == 1 || student.getOlimpiada().getCity() == 1 || student.getOlimpiada().getRegion() == 1){
                    student.infoAll();
                }
            }
        }

        //2 ЗАДАНИЕ
        System.out.println("\n\n2 ЗАДАНИЕ\n\n");

        for (Student student: studentList){
            if (student.getKyrs() != 0){
                student.infoAll();
            }
        }


        //3 ЗАДАНИЕ

        System.out.println("\n\n3 ЗАДАНИЕ\n\n");

        List<Learner> stipLerner = new ArrayList<>();

        for (School student: students){
            if (student.schoolStip()){
                stipLerner.add(student);
            }
        }

        for (Student student: studentList){
            if (student.checkStip()){
                stipLerner.add(student);
            }
        }

        for (Learner learner: stipLerner){
            learner.infoAll();
        }

    }
}