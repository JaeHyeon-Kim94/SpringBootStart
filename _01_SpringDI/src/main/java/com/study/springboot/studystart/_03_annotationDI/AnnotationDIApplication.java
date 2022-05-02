package com.study.springboot.studystart._03_annotationDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
SpringBootApplication = 다음의 세 가지 기능을 수행한다.
                            @Configuration
                                - Bean을 생성할 때 SingleTon으로 한 번만 생성. 각종 설정 세팅
                            @EnableAutiConfiguration
                                - 스프링 어플리케이션 컨텍스트를 만들 때 자동으로 설정하는 기능을 활성화.
                                  클래스패스를 기준으로 사용자가 필요할 것 같은 빈을 추측해 ApplicationContext를 만들때
                                  필요한 설정을 한다.
                            @ComponentScan
                                - 지정한 위치 이하에 있는 @Component와 @Configuration이 붙은 클래스를 스캔해 빈으로 등록.
*/
@SpringBootApplication
public class AnnotationDIApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationDIApplication.class, args);
    }
}
