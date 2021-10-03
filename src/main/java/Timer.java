import timer.Chronometer;
import timer.Printer;

public class Timer {
    public static void main(String[] args) {
        var chronometer = new Chronometer();
        var secondsPrinter = new Printer(chronometer, "", 1);
        var Printer1 = new Printer(chronometer, "5 second left", 5);
        var Printer2 = new Printer(chronometer, "7 seconds left", 7);

        new Thread(chronometer).start();
        new Thread(secondsPrinter).start();
        new Thread(Printer1).start();
        new Thread(Printer2).start();
    }
}
