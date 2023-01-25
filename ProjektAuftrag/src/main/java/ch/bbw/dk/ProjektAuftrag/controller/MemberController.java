package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Member;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import ch.bbw.dk.ProjektAuftrag.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllEmployes(){
        return memberService.findAllMembers();
    }
}
