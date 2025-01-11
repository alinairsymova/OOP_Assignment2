import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Engineer", 50000.00);

        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Payable> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort((List<Person>) (List<?>) people);

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable p : payables) {
            System.out.println(p + " earns " + String.format("%.2f", p.getPaymentAmount()) + " tenge");
        }
    }
}