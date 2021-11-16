package org.apache.commons.csv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class CSVPrinterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void MyCSVPrinterTest_1() throws IOException {
        final StringWriter sw = new StringWriter();
        try (final CSVPrinter printer = new CSVPrinter(sw,
                CSVFormat.DEFAULT.withQuote(null).withHeader("C1", "C2", "C3"))) {
            printer.printRecord("a", "b", "c");
            printer.printRecord("x", "y", "z");
            Assertions.assertEquals("C1,C2,C3\r\na,b,c\r\nx,y,z\r\n", sw.toString());
        }
    }
}