public class Student extends Person{
    String Status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        Status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Status='" + Status + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
