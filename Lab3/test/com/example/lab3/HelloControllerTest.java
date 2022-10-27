package com.example.lab3;

import static org.junit.Assert.*;

public class HelloControllerTest {

    //тестування виведення дати

    @org.junit.Test
    public void date() {

        assertEquals(9,HelloController.date(550));
    }

    //тестування виведення студента за номером

    @org.junit.Test
    public void classmates() {
        assertEquals("Беліч Олександр", HelloController.classmate(1));
    }
}