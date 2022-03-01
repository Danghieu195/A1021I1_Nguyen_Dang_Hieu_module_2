package _18_String_And_Regex.Bai_tap.Validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private static Matcher matcher;

    public static final String NameClass_Regex = "^[C|P|A][0-9]{4}[G-M]$";

    public NameClass() {
        pattern = Pattern.compile(NameClass_Regex);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
