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
}
