package practice;

public class Qs5 {

    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean canRelax = isWeekend || isHoliday;

        System.out.println("Can Relax: " + canRelax);
    }
}