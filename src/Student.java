import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public String index;
    public String email;
    public String address;
    public ArrayList<Double> grades;
    public Student(String fname, String lname, String index, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.index = index;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }
    public void addGrade(double grade) {
        if(grades.size()>20)
        {
            throw new IllegalArgumentException("Uczen nie moze miec wiecej niz 20 ocen");
        }
        this.grades.add(grade);
    }
    public void wyswietl() {
        System.out.println(fname + " " + lname);

    }
   public double getAverageGrade() {
        if(grades.isEmpty())
        {
            throw new IllegalArgumentException("Uczen nie ma zadnych ocen");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = (sum / grades.size());
        return Math.round(average * 2) / 2.0;
    }

}
