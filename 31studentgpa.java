import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            students.add(new Student(sc.next(), sc.nextInt()));
        }

        int k = sc.nextInt();

        // Optimal stream processing
        System.out.println(
            students.stream()
                    .sorted(Comparator
                        .comparingInt(Student::getMarks).reversed()
                        .thenComparing(Student::getName))
                    .limit(k)
                    .map(Student::getName)
                    .collect(Collectors.joining(" "))
        );
    }
}
