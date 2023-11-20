public class Person {
    String Name;
    String Address;

    String PhoneNumber;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }

    String EmailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        Name = name;
        Address = address;
        PhoneNumber = phoneNumber;
        EmailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }
}
