package _18_String_And_Regex.Thuc_hanh.Validate_Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String Account_Regex = "^[a-z_0-9]{6,}$";

    public AccountExample() {
        pattern = Pattern.compile(Account_Regex);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
