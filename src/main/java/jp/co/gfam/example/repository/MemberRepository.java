package jp.co.gfam.example.repository;

import jp.co.gfam.example.entity.Member;
import jp.co.gfam.example.entity.MemberEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
