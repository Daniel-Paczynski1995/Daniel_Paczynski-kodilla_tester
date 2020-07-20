public class GradesRuner {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(2);
        grades.add(1);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(3);
    double avg = grades.averageGrades();
    System.out.println(avg);
    System.out.println(grades.LastGrades());
    }
}