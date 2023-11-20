public abstract class Employee extends Person {
    String Department;
    double MonthlySalary;
    String DateHired;

    @Override
    public String toString() {
        return "Employee{" +
                "Department='" + Department + '\'' +
                ", MonthlySalary=" + MonthlySalary +
                ", DateHired='" + DateHired + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;
    }

    public String getDateHired() {
        return DateHired;
    }

    public void setDateHired(String dateHired) {
        DateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        Department = department;
        MonthlySalary = monthlySalary;
        DateHired = dateHired;
    }
}
