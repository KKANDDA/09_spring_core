package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 제일 우선적으로 이 클래스를 사용할 것을 명시해주는 명령어. 그리고 이거 없으면 오류가 날 것이다. 포켓몬이 세마리나 되니..
public class Charmander implements Pokemon{
    @Override
    public void attack() {
        System.out.println("파이리 불꽃 발싸!! 슈슉~!~! 슈슈슉!~!~!");
    }
}
