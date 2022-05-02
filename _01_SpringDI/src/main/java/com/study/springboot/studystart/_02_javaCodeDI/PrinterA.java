package com.study.springboot.studystart._02_javaCodeDI;

public class PrinterA  implements  Printer{
    @Override
    public void print(String message) {
        System.out.println("Printer A : " + message);
    }
}
