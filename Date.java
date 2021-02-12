import java.util.Scanner;

public class Date implements Comparable<Date> {
    private int date;
    private int day;
    private int month;

    public Date(String date){

    
        

        if (date == null) {
            throw new IllegalArgumentException("Please enter the date in the correct format!");
        }
        else {
            System.out.println(date);

        }


    }
}