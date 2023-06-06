package cat.barcelonactiva.itacademy.Testing.Ex1_1;

import java.util.ArrayList;
import java.util.List;

public class App {
    private final List<String> months;

    public App() {
        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public List<String> getMonths() {
        return months;
    }
}
