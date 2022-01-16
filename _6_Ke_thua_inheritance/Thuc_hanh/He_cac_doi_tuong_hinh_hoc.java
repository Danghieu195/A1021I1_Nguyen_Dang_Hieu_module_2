package _6_Ke_thua_inheritance.Thuc_hanh;

public class He_cac_doi_tuong_hinh_hoc {
}

 class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape( String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public boolean isFilled() {
         return filled;
     }

     public void setFilled(boolean filled) {
         this.filled = filled;
     }

     @Override
     public String toString() {
        return "A shape with color of " + this.color + ((this.filled) ? " and filled!" : " and not filled!");
     }



 }

