package com.study.springboot.studystart._02_javaCodeDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeDiApplication {
    public static void main(String[] args) {
        //SpringApplication.run(StudystartApplication.class, args);

        //1. IoC 컨테이너 생성
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        //2. Member Bean 가져오기
        Member member1 = (Member)context.getBean("member1");
        member1.print();

        //3. Member Bean 가져오기
        Member member2 = context.getBean("hello", Member.class);
        member2.print();

        //4. PrinterB Bean 가져오기
        Printer printer = context.getBean("printerB", Printer.class);
        member1.setPrinter(printer);
        member1.print();

    }
}