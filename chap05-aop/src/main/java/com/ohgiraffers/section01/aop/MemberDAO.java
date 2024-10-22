package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Repository
public class MemberDAO {

    private final Map<Integer, MemberDTO> membersMap;

    public  MemberDAO(){
        membersMap   = new HashMap<Integer, MemberDTO>();
        membersMap.put(1, new MemberDTO(1, "서현준"));
        membersMap.put(2, new MemberDTO(2, "서현욱"));
        membersMap.put(3, new MemberDTO(3, "서현오"));
    }

    public Map<Integer, MemberDTO> selectMembers(){
        return membersMap;
    }

    public MemberDTO selectMember(int id) {
        MemberDTO returnMember = membersMap.get(id);
        if(Objects.isNull(returnMember)){
            throw new RuntimeException("해당 id를 가진 회원은 존재하지 않습니다.");
        }
        return returnMember;
    }

}
