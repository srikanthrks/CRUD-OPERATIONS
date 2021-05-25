package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Members {
    @Id
    @Column(name="member_id")
    private String memberId;

    @Column(name="member_name")
    private String memberName;

    @Column(name = "member_email")
    private String memberEmail;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String member_id) {
        this.memberId = member_id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
}
