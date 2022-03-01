package _18_String_And_Regex.Thuc_hanh.Validate_Account;

public class AccountExampleTest {
    public static void main(String[] args) {

        AccountExample accountExample = new AccountExample();

        final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

        for ( String account : validAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println(" Account is " + account + " is valid : " + isvalid);
        }

        for ( String account : invalidAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println(" Account is " + account + " is valid : " + isvalid);
        }
    }
}
