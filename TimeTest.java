import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args){
        int seconds;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of seconds");
        seconds = keyboard.nextInt();

        TimeCalc calc = new TimeCalc(seconds);

        System.out.println("The number of minutes are: "+calc.secToMin()+"\nThe number of hours are: "+calc.secToHr()+"\nThe number of days are: "+calc.secToDay());
    }
}
