package anime.project.repository;

import anime.project.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    public void join(Member member);
}
