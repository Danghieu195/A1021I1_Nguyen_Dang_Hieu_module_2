package _5_Access_modifier_static_method_static_property.Bai_tap;

public class Xay_dung_lop_chi_ghi_trong_java {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Hieu", "D17");
        System.out.println(hs1.getName());
        System.out.println(hs1.getClasses());
//        hs1.setName("Dang Hieu");
//        hs1.setClasses("D17.2015");

    }
}

class HocSinh {
    private String name = "John";
    private String classes =  "C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
        System.out.println(classes);
    }

    public HocSinh(String name, String classes) {
        this.name = name;
        this.classes = classes;
  }
}