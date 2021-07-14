package com.example.notepad_base.entity.SystemEntity;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "sys_user_info")
public class SysUserInfo implements Serializable {
    private static final long serialVersionUID = -5498293736447979838L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private String userId;//用户id
    @Column(name = "user_count")
    private String userCount;//用户账号
    @Column(name = "user_name")
    private String userName;//用户名称
    @Column(name = "head_avatar")
    private byte[] headAvatar;//用户头像
    @Column(name = "major")
    private String major;//专业
    @Column(name = "skill")
    private String skill;//技能
    @Column(name = "signature")
    private String signature;//签名

    public SysUserInfo() {
    }

    public SysUserInfo(String userId, String userCount, String userName, byte[] headAvatar, String major, String skill, String signature) {
        this.userId = userId;
        this.userCount = userCount;
        this.userName = userName;
        this.headAvatar = headAvatar;
        this.major = major;
        this.skill = skill;
        this.signature = signature;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public byte[] getHeadAvatar() {
        return headAvatar;
    }

    public void setHeadAvatar(byte[] headAvatar) {
        this.headAvatar = headAvatar;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
