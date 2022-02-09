package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);                     //저장소에 저장
    Optional<Member> findById(Long id);             //id로 검색
    //null을 optional로 감싸서 반환
    Optional<Member> findByName(String name);       //이름으로 검색
    List<Member> findAll();                         //저장된 모든 회원리스트
}
