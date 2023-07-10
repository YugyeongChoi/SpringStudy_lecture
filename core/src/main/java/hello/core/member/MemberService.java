package hello.core.member;

public interface MemberService {
    //커멘드 B로 들어옴
    void join(Member member); //회원 가입
    Member findMember(Long memberId); //회원 조회

}
