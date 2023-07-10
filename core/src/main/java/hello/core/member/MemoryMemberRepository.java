package hello.core.member;

import java.util.HashMap;
import java.util.Map;
public class MemoryMemberRepository implements MemberRepository {
    //빨간줄 쳐지고 안될시 그냥 옵션+엔터 누르면 됨
    private static Map<Long, Member> store = new HashMap<>();


    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
