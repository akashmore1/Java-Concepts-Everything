package person;

public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return this.lastName;
        } else if (lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
