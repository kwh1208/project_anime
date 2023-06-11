package anime.project.repository;

import anime.project.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {
    public void join(Member member);
    public Member findMemberById(String id);
    public List<Member> findAllMember();
    public String findId(String name, Integer phoneNumber);
    public Integer findPassword(String id);
}
