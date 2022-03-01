package _18_String_And_Regex.Bai_tap.Validate_ten_cua_lop_hoc;

public class NameClassTest {
    public static void main(String[] args) {
        String[] validNameClass = new String[] {"C0318G" , "A1021I"};
        String[] invalidNameClass = new String[] {"M0318G" , "P1021A"};

        NameClass nameClass = new NameClass();

        for ( String name : validNameClass){
            boolean isvalid = nameClass.validate(name);
            System.out.println(" Account is " + name + " is valid : " + isvalid);
        }

        for ( String name : invalidNameClass){
            boolean isvalid = nameClass.validate(name);
            System.out.println(" Account is " + name + " is valid : " + isvalid);
        }

    }
}
