public class TestTime {
    public static void main(String[] args) {
        Time Time1 = new Time(18, 7, 13);
        Time Time2 = new Time(6, 55, 45);

        System.out.println("");
        System.out.println("Start times:");
        System.out.println("Time 1: " + Time1);
        System.out.println("Time 2: " + Time2);

        // Call nextSecond() for t1 and previousSecond() for t2 //
        Time1.nextSecond();
        Time2.previousSecond();

        System.out.println("\nNew Times for Time 1 and Time 2:");
        System.out.println("Time 1: " + Time1);
        System.out.println("Time 2: " + Time2);
    }

}