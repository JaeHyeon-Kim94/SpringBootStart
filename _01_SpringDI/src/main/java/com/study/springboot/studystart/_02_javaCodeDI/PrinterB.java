package com.study.springboot.studystart._02_javaCodeDI;

public class PrinterB implements Printer{
    @Override
    public void print(String message) {
        System.out.println("Printer B : " + message);
    }
}
