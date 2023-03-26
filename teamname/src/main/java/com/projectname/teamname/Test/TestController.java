package com.projectname.teamname.Test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    /*@GetMapping("api/test")
    public String test(MemberDto dto) {
        return testService.test(dto);
    }*/
    @PostMapping("api/test")
    public String saveTest(@RequestBody MemberDto dto) {
        System.out.println(dto.member_id);
        System.out.println(dto.member_pw);
        return testService.saveTest(dto);
    }
}
