import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                // 1. Sort by CGPA (descending)
                if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                }

                // 2. Sort by name (ascending)
                if (!s1.name.equals(s2.name)) {
                    return s1.name.compareTo(s2.name);
                }

                // 3. Sort by ID (ascending)
                return s1.id - s2.id;
            }
        });

        // Print only names
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}