public class TestDate {
    public static void main(String[] args) {
        // Create a Date object //
        Date date = new Date(21, 9, 2024);

        System.out.println("");
        // Print the date using toString() method //
        System.out.println("Start Date: " + date.toString());

        // Test setters //
        date.setYear(2025);
        date.setMonth(10);
        date.setDay(22);

        System.out.println("");
        System.out.println("New Date: " + date.toString());
    }
}
