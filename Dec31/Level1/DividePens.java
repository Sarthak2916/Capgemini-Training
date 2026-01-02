package Level1;

public class DividePens {
    public static void main(String[] args) {
        int totalPens=14;
        int totalStudents=3;
        int remainingPens = totalPens%totalStudents;
        int penPerStudent=(totalPens-remainingPens)/totalStudents;
        System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "
                +remainingPens);
    }
}
