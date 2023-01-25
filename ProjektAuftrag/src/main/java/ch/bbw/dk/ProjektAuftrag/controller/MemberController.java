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
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping
    public List<Member> getAllEmployesController(){
        return memberService.findAllMembers();
    }

    @PostMapping
    public Member createMemberController(@RequestBody Member member){
        return memberService.createMember(member);
    }

    @PutMapping("/{id}")
    public Member updateMemberController(@RequestBody Member member, @PathVariable int id){
        return memberService.updateMember(id, member);
    }

    @DeleteMapping("/{id}")
    public void deleteMemberController(@PathVariable int id){
        memberService.deleteMember(id);
    }
}
