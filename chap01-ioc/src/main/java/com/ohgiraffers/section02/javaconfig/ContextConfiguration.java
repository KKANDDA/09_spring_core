package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name = "member") // 이름을 지정하지 않으면 메소드 이름을 이름으로 갖는다.
    public MemberDTO getMember(){
        return new MemberDTO(1, "user02", "pass", "홍길동");
    }
}
