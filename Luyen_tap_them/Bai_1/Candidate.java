package Luyen_tap_them.Bai_1;

public class Candidate {
    private int msv;
    private String dayOfBirth;
    private String name;
    private double math;
    private double english;
    private double literature;
    private double  sum;

    public Candidate() {

    }

    public Candidate(int msv,String name, String dayOfBirth, double math, double english, double literature){
        this.msv = msv;
        this.dayOfBirth = dayOfBirth;
        this.math = math;
        this.english = english;
        this.literature = literature;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getSum(){
        return this.sum = (this.english + this.literature + this.math);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "msv = " + msv +
                ", dayOfBirth = '" + dayOfBirth + '\'' +
                ", name = '" + name + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", literature=" + literature +
                '}';
    }
}
