package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @Test
    public void testGetThingsToPrint() {


        Printer printer = new Printer(new BigDecimal(15));
        Printer printer1 = new Printer(15L);
        Printer printer2 = new Printer(LocalDate.of(2023, 03, 15));
        Printer printer3 = new Printer("Hello World!");
        Printer printer4 = new Printer(15);

        String text = "Hello World!";
        BigDecimal bigDecimal = new BigDecimal(15);
        LocalDate localDate = LocalDate.of(2023, 03, 15);
        long longNumber = 15L;
        int number = 15;

        assertEquals(text, printer3.getThingToPrint());
        assertEquals(bigDecimal, printer.getThingToPrint());
        assertEquals(longNumber, printer1.getThingToPrint());
        assertEquals(localDate, printer2.getThingToPrint());
        assertEquals(number, printer4.getThingToPrint());

    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }


    @Test
    void testPrintBigDecimal() {
        Printer<BigDecimal> printer = new Printer<>(BigDecimal.valueOf(15));
        printer.print();
        assertEquals("15", outputStreamCaptor.toString().trim());

    }

    @Test
    void testPrintLong() {
        Printer<Long> printer = new Printer<>(15L);
        printer.print();
        assertEquals("15", outputStreamCaptor.toString().trim());
    }

    @Test
    void testPrintLocalDate() {
        Printer<LocalDate> printer = new Printer<>(LocalDate.of(2023, 03, 15));
        printer.print();
        assertEquals("2023-03-15", outputStreamCaptor.toString().trim());
    }

    @Test
    void testPrintString() {
        Printer<String> printer = new Printer<>("Hello World!");
        printer.print();
        assertEquals("Hello World!", outputStreamCaptor.toString().trim());
    }


    @Test
    void testPrintInteger() {
        Printer<Integer> printer = new Printer<>(15);
        printer.print();
        assertEquals("15", outputStreamCaptor.toString().trim());
    }
}













