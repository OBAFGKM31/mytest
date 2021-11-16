import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class main {

    public static void main(String args[]) throws IOException {
        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csv1.txt"),
                CSVFormat.EXCEL.withHeader("id", "userName", "firstName", "lastName", "birthday"))) {
            //printer.printRecord("id", "userName", "firstName", "lastName", "birthday");
            printer.printRecord(1, "john73", "John", "Doe", LocalDate.of(1973, 9, 15));
            printer.println();
            printer.printRecord(2, "mary", "Mary", "Meyer", LocalDate.of(1985, 3, 29));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
