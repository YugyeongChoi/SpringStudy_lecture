package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //인터페이스 memberRepository에 MemoryMemberRepository 구현객체 선택
    //MemberServicrImpl은 MemberRepository, MemoryMemberRepository에 모두 의존
    //즉 DIP 위반
    //단축키 커멘드 쉬프트 엔터 -> 세미콜론까지 붙여줌

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
//join에서 save를 호출하면 다형성에 의해서 MemoryMemberRepository에 있는 MemberRepository 인터페이스가 아니라
    //MemoryMemberRepository에 있는 save가 호출됨 (오버라이드한것)
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
