package com.study.springboot.studystart._03_annotationDI;

import com.study.springboot.studystart._02_javaCodeDI.Printer;
import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printer A : " + message);
    }
}
