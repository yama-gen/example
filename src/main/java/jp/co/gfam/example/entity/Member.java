package jp.co.gfam.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long memberId;

    private String name;

    private String emailAddress;

    private String password;

    @OneToMany(mappedBy = "member")
    private List<MemberEvent> memberEventList;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MemberEvent> getMemberEventList() {
        return memberEventList;
    }

    public void setMemberEventList(List<MemberEvent> memberEventList) {
        this.memberEventList = memberEventList;
    }
}
