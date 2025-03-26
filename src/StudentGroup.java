import java.util.ArrayList;

public class StudentGroup {
    public String nazwa;
    public ArrayList<Student> students;
    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if(students.size()>=15)
        {
            throw new IllegalArgumentException("Grupa nie może mieć więcej niż 15 studentów");
        }
        if(students.contains(s))
        {
            throw new IllegalStateException("Student już w tej grupie");
        }
        students.add(s);
    }
    public void wyswietlGrupe() {
        System.out.println("Grupa: " + nazwa);
        for (Student s : students) {
            s.wyswietl();
        }
    }
}
