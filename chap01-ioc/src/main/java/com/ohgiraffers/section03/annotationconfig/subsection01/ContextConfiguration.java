package com.ohgiraffers.section03.annotationconfig.subsection01;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection03") // 이름 지정..
@ComponentScan(basePackages = "com.ohgiraffers.common") // 경로 하위에 있는 것들을 Bean으로 지정..
public class ContextConfiguration {
}
