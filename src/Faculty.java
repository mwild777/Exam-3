public class Faculty extends Employee {
    String OfficeHours;
    String Rank;
    @Override
    public String toString() {
        return "Faculty{" +
                "OfficeHours='" + OfficeHours + '\'' +
                ", Rank='" + Rank + '\'' +
                ", Department='" + Department + '\'' +
                ", MonthlySalary=" + MonthlySalary +
                ", DateHired='" + DateHired + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }
    public String getOfficeHours() {
        return OfficeHours;
    }

    public void setOfficeHours(String officeHours) {
        OfficeHours = officeHours;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department,
                   double monthlySalary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        OfficeHours = officeHours;
        Rank = rank;
    }
}
