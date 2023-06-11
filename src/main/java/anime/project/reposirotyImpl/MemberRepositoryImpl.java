package anime.project.reposirotyImpl;

import anime.project.domain.Member;
import anime.project.repository.MemberRepository;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public void join(Member member) {

    }

    @Override
    public Member findMemberById(String id) {
        return null;
    }

    @Override
    public List<Member> findAllMember() {
        return null;
    }

    @Override
    public String findId(String name, Integer phoneNumber) {
        return null;
    }

    @Override
    public Integer findPassword(String id) {
        return null;
    }
}
