package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        // 자바 내에서 불러낸 방식..
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO memberDTO = (MemberDTO) context.getBean("member");
        System.out.println("memberDTO = " + memberDTO);
    }
}
