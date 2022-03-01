package Case_Study.Model;

public class Person {
    String personCode;
    String name;
    String sex;
    String dateOfBirth;
    String identifiNumber;
    String phoneNumber;
    String personEmail;

    public Person(){

    }

    public Person(String personCode, String name, String sex, String dateOfBirth, String identifiNumber, String phoneNumber, String personEmail) {
        this.personCode = personCode;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.identifiNumber = identifiNumber;
        this.phoneNumber = phoneNumber;
        this.personEmail = personEmail;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentifiNumber() {
        return identifiNumber;
    }

    public void setIdentifiNumber(String identifiNumber) {
        this.identifiNumber = identifiNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personCode='" + personCode + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identifiNumber='" + identifiNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", clientEmail='" + personEmail + '\'' +
                '}';
    }
}
