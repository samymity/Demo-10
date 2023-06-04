package com.example.demo.util;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class CursorMover {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot robot = new Robot();

        // move the cursor every 5 seconds
        while (true) {
            robot.mouseMove(0, 0); // move the cursor to (0,0)
            robot.mouseMove(100, 100); // move the cursor to (100,100)
            Thread.sleep(5000); // wait for 5 seconds
        }
    }
}