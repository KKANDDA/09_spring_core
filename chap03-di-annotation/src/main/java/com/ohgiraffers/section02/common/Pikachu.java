package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon{

    @Override
    public void attack() {
        System.out.println("피카츄 백만 볼트!!@!@!!!~!~!~!!! 지지직!~!!! 지직지지직!@~!!!");
    }
}
