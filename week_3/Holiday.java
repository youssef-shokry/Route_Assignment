package week_3;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday instance1, Holiday instance2){
        return instance1.day == instance2.day;
    }

    public double avgDate(Holiday[] holidayArr){
        int sumOfDays = 0;
        int numberOfDays = 0;

        for (Holiday holiday : holidayArr) {
            sumOfDays += holiday.day;
            numberOfDays++;
        }
        return ((double) sumOfDays / numberOfDays);
    }
}
