package Project2;

public class StudentA extends Marks {

    private int getMarks1;
    private int getMarks2;
    private int getMarks3;


    public StudentA(int getMarks1, int getMarks2, int getMarks3) {
        this.getMarks1 = getMarks1;
        this.getMarks2 = getMarks2;
        this.getMarks3 = getMarks3;
    }

    @Override
    double getPercentage() {
        return (getMarks1 + getMarks2 + getMarks3) / 3;


    }
}

class StudentB extends Marks {

    private int Marks1;
    private int Marks2;
    private int Marks3;
    private int Marks4;

    public StudentB(int Marks1, int Marks2, int Marks3, int Marks4) {
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
        this.Marks4 = Marks4;
    }

    @Override
    double getPercentage() {
        return (Marks1 + Marks2 + Marks3 + Marks4) / 4;

    }
}

class TesterMarks {
    public static void main(String[] args) {
        StudentA obj = new StudentA(56, 78, 89);
        System.out.println("Percentage of Student A " + obj.getPercentage());

        StudentB obj1 = new StudentB(45, 89, 78, 65);
        System.out.println("Percentage of Student B " + obj1.getPercentage());


    }

}

