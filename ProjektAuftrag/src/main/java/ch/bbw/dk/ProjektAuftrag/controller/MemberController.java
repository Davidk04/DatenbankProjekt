package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Member;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping
    public List<Member> getAllEmployes(){
        return (List<Member>) memberRepository.findAll();
    }

    @PostMapping
    public Member createMember(@RequestBody Member member){
        return memberRepository.save(member);
    }
}
