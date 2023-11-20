public class Staff extends Employee {
    String Title;

    @Override
    public String toString() {
        return "Staff{" +
                "Title='" + Title + '\'' +
                ", Department='" + Department + '\'' +
                ", MonthlySalary=" + MonthlySalary +
                ", DateHired='" + DateHired + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department,
                 double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        Title = title;
    }
}
