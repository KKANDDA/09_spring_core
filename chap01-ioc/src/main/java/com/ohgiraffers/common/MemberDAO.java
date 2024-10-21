package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component // 이 클래스를 빈으로 등록한다는 뜻.. 클래스 자체가 빈이라는 뜻..
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        this.memberMap = new HashMap<>(); // 자료형은 바꿀수 없지만 (파이널이라..) 내용은 바꿀 수 있다.

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "홍길순"));
    }
    // 매개변수로 전달 받은 회원 번호를 map에서 조회 후 회원 정보 리턴 메소드
    public MemberDTO selectMember(int seq) {
        return memberMap.get(seq);
    }

    // 매개변수로 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean 형식으로 리턴하는 메소드
    public boolean insertMember(MemberDTO member) {
        int before = memberMap.size();
        memberMap.put(member.getSequence(), member);

        return memberMap.size() > before? true : false; // 추가 됐는지 확인하는..
    }

}
