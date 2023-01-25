package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Member;
import ch.bbw.dk.ProjektAuftrag.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private MemberService memberService;

    @GetMapping
    public Member getMember(@RequestParam Integer id){
        return memberService.getMember(id);
    }
}
