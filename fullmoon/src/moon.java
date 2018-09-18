import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class moon {
    public static void main(String args[]){

        Date xDate = new Date();
        Calendar xCal = Calendar.getInstance();


        LocalDate today = LocalDate.now();


        int subtract = today.getDayOfMonth();


        LocalDate fullMoon;

        System.out.println("Todays date is " + today);

        if (today.getMonthValue() == 1 || today.getMonthValue() == 2 || today.getMonthValue() == 3){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(31);
            System.out.println("The next full moon is " + fullMoon);
        }


        if (today.getMonthValue() == 4 || today.getMonthValue() == 5){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(29);
            System.out.println("The next full moon is " + fullMoon);
        }


        if (today.getMonthValue() == 6 || today.getMonthValue() == 7){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(27);
            System.out.println("The next full moon is " + fullMoon);

        }


        if (today.getMonthValue() == 8){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(26);
            System.out.println("The next full moon is " + fullMoon);
        }

        if (today.getMonthValue() == 9 || today.getMonthValue() == 10){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(24);
            System.out.println("The next full moon is " + fullMoon);
        }



        if (today.getMonthValue() == 11 || today.getMonthValue() == 12){
            fullMoon = today.minusDays(subtract);
            fullMoon = fullMoon.plusDays(22);
            System.out.println("The next full moon is " + fullMoon);
        }



    }



}
