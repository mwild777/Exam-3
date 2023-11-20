import java.util.ArrayList;

public class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Student("Joe","1234 West L St.","9701234567",
                "Joe@school.com","Junior"));
        people.add(new Student("Sarah","1236 West L St.","9701234568",
                "Sarah@school.com","Freshman"));
        people.add(new Faculty("Dave","1234 West L St.","9701234566",
                "Dave@school.com","Math",2400.67,"February 1st",
                "Monday @ 5 AM", "Senior"));
        people.add(new Faculty("Karen","1529 West L St.","9708764566",
                "Karen@school.com","English",5.67,"June 1st",
                "None", "Junior"));
        people.add(new Staff("Jim","1521 West L St.","9702344566",
                "Jim@school.com","Cleaning",1500.42,"May 1st",
                "Janitor"));
        people.add(new Staff("Jess","1521 West L St.","9702354566",
                "Jess@school.com","Office",1300.41,"May 7th",
                "Assistant"));
        for (Person Person : people) {
            System.out.println(Person.toString());
            System.out.println("\n");
        }
        ArrayList<Person> employeeList = EmployeeList(people);
    }
    public static ArrayList EmployeeList(ArrayList<Person> people) {
        ArrayList<Person> newList = new ArrayList<Person>();
        for (Person Person : people) {
            if (Person instanceof Employee) {
                newList.add(new Person());
            }
            return newList;
        }

    }
}
