package enums;


public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        for (Week day : Week.values()) {
            System.out.println(String.format("%s - day of the week - %d",day.name(),day.numDay));
        }
    }
    public enum Week {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);
        private final int numDay;

        Week(int numDay){
            this.numDay=numDay;
        }

    }
}
