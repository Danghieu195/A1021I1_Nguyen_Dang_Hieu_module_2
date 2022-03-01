package _18_String_And_Regex.Thuc_hanh.Validate_Email;

public class EmailExampleTest {
    public static void main(String[] args) {
       EmailExample emailExample = new EmailExample();

        String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "Aasd@hotmail.com"};
        String[] invalidEmail = new String[]{"1#@gmail.com", "ab@.com", "ad-adhotmail.com"};

        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isvalid);
        }

        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isvalid);
        }
    }
}
