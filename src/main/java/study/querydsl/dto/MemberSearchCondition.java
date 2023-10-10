package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    //회원명, 팀명, 나이(ageGoe, ageLoe)

    private String username;
    private String teamName;
    private Integer ageGoe; //null 일 수 있으니 Integer
    private Integer ageLoe;
}
