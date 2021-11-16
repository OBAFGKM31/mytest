package org.apache.commons.csv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

class MyCSVPrinterTest_2 {

    @Test
    void MyCSVPrinterTest_2() throws IOException {
        final StringWriter sw = new StringWriter();
        try (final CSVPrinter printer = new CSVPrinter(sw,
                CSVFormat.DEFAULT.withQuote(null))) {
            printer.printRecord("a", "b", "c");
            printer.printRecord("x", "y", "z");
            Assertions.assertEquals("a,b,c\r\nx,y,z\r\n", sw.toString());
        }
    }

}
