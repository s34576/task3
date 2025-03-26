public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "s33445", "s33445@gmail.com", "WAarszawa");
        Student student2 = new Student("Alicja", "Chmura", "s33335", "s33335@gmail.com", "Gdansk");
        Student student3 = new Student("Maria", "Skrzek", "s12345", "s12345@gmail.com", "Płock");
        StudentGroup studentGroup = new StudentGroup("Grupa_1");
        student1.addGrade(4.0);
        student1.addGrade(5.0);
        student1.addGrade(4.5);
        student1.addGrade(3.5);
        student1.wyswietl();
        student2.addGrade(4.0);
        student2.addGrade(5.0);
        student2.addGrade(4.5);
        student2.addGrade(3.5);
        student3.addGrade(4.0);
        System.out.println("Średnia ocen: " + student1.getAverageGrade());
        student2.wyswietl();
        System.out.println("Średnia ocen: " + student2.getAverageGrade());
        student3.wyswietl();
        System.out.println("Średnia ocen: " + student3.getAverageGrade());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.wyswietlGrupe();
    }
}