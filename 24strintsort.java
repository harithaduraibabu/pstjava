import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    String getName() { return name; }
    int getAge() { return age; }
    
    static boolean isOlderThan(Person p, int limit) {
        return p.age > limit;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Person> persons = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            persons.add(new Person(parts[0], Integer.parseInt(parts[1])));
        }
        int ageLimit = sc.nextInt();
        
        // 1. Alphabetical sort - method reference, pre-allocate collector
        String line1 = persons.stream()
            .sorted(Comparator.comparing(Person::getName))
            .map(Person::getName)
            .collect(Collectors.joining(" ", "", ""));
        
        // 2. Filter older - static method reference
        String line2 = persons.stream()
            .filter(p -> Person.isOlderThan(p, ageLimit))
            .map(Person::getName)
            .collect(Collectors.joining(" ", "", ""));
        
        // 3. Uppercase - String instance method reference (most optimal)
        String line3 = persons.stream()
            .map(p -> p.getName().toUpperCase())
            .collect(Collectors.joining(" ", "", ""));
            
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        
        sc.close();
    }
}
