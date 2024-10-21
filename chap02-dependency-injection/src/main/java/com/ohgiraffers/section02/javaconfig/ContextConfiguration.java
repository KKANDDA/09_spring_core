package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean // 빈이 아니면 호출될 때마다 중복 생성될 것이다. 빈으로 등록해 두면 싱글톤으로 관리된다. 돌려쓰기!!
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-222-583988");
    }

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO(30, "서현준", "010-2720-9519", "diobobo#naver.com", accountGenerator());
        return member;
    }

}
