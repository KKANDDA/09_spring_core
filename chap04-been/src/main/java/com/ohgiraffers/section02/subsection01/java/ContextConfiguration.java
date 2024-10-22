package com.ohgiraffers.section02.subsection01.java;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product cartBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 1000, 500);
    }

    @Bean
    @Scope("prototype") // 기본값은 싱글톤이다. 이렇게 쓰면 스코프를 지정할 수 있다.
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    // 빈이 등록될 때 사용될 메소드와 context가 종료 될 때 사용될 메소드
    public Owner owner(){
        return new Owner();
    }
}
