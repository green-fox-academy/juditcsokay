public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsPerDay = (24*60)*60;
        System.out.println(secondsPerDay);

        int passedseconds = (((14*60)+34)*60)+42;
        int remainingSeconds = secondsPerDay - passedseconds;

        System.out.println("The remaining seconds from the day: " + remainingSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}