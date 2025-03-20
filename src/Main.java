public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "s33445", "1234@gmail.com", "WAarszawa", 2);
        student1.addGrade(4.0);
        student1.addGrade(5.0);
        student1.addGrade(4.5);
        student1.addGrade(3.5);
        student1.wyswietl();
        System.out.println(student1.getAverageGrade());

    }
}