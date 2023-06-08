package anime.project.service;

import anime.project.domain.Member;
import anime.project.repository.MemberRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member login(String id, String password) {
        Member member = new Member();
        member.setId(id);
        member.setEmail(password);
        return member;
    }

    @Override
    public void logout(HttpSession session) {
        session.removeAttribute("member");
    }

    @Override
    public void join(Member member) {
        memberRepository.join(member);
    }
}
