package com.projectname.teamname.Test;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    Long member_sn;
    @Column
    String member_id;
    @Column
    String member_pw;

}
