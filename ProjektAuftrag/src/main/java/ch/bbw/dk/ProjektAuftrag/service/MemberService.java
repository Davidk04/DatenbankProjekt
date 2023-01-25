package ch.bbw.dk.ProjektAuftrag.service;

import ch.bbw.dk.ProjektAuftrag.model.Member;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    public Member createMember(Member member){
        return memberRepository.save(member);
    }

    public Member updateMember(int id, Member member){
        member.setId(id);
        return memberRepository.save(member);
    }

    public void deleteMember(int id){
        memberRepository.deleteById(id);
    }
}
