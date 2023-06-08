package anime.project.service;


import anime.project.domain.Member;
import jakarta.servlet.http.HttpSession;

public interface MemberService {
    public Member login(String id, String password);

    public void logout(HttpSession session);

    public void join(Member member);
}
