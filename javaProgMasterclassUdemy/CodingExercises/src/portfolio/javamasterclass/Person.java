package portfolio.javamasterclass;

public class Person {
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

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public void setAge(int value) {
        this.age = (value < 0 || value > 100) ? 0 : value;
    }

    public boolean isTeen() {
        return (this.getAge() > 12 && this.getAge() < 20);
    }

    public String getFullName() {
        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()) {
            return "";
        } else if (this.getFirstName().isEmpty()) {
            return this.getLastName();
        } else if (this.getLastName().isEmpty()) {
            return this.getFirstName();
        } else {
            return this.getFirstName() + " " + this.getLastName();
        }
    }
}
