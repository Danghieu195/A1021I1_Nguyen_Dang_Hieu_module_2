package Case_Study.Model;

public class Employee extends Person {
    String level;
    String position;
    Integer salary;

    public Employee() {

    }

    public Employee(String personCode, String name, String sex, String dateOfBirth, String identifiNumber, String phoneNumber, String personEmail, String level, String position, Integer salary) {
        super(personCode, name, sex, dateOfBirth, identifiNumber, phoneNumber, personEmail);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", personCode='" + personCode + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identifiNumber='" + identifiNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", clientEmail='" + personEmail + '\'' +
                '}';
    }
}
