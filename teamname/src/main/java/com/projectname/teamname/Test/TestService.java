package com.projectname.teamname.Test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final MemberRepository memberRepository;

    /*public String test(MemberDto dto) {
        //Member member = memberRepository.findByMember_id(dto.member_id);
        if (member.member_pw.equals(dto.member_pw)){
            return "login success";
        }else {
            return "login fail";
        }
    }*/
    public String saveTest(MemberDto dto){
        Member member = new Member();
        member.setMember_id(dto.member_id);
        member.setMember_pw(dto.member_pw);
        System.out.println(dto.member_id);
        System.out.println(dto.member_pw);
        memberRepository.save(member);
        return "success";
    }
}
