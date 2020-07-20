public class Grades {
    private int[] grades;
    private int size;
    private int average;
    private int Last;

    public Grades() {
      this.grades = new int[10];
    this.size = 10;

    }

    public void add(int grade) {
        if (this.size==10) {
            return;
        }

        this.grades[this.size] = grade;

        this.size++;
    }

    public int LastGrades() {
        if (this.size == 0) {
            return 0;
        }
        return this.grades[this.size - 1];
    }

    public double averageGrades() {
        if (this.size == 0) {
            return 0;
        }
            double sum = 0;
            for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];

            }
        double avg = sum/ this.size;
    return avg;
    }
    }


