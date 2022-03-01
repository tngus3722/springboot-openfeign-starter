package com.tngus3722.openfeignstarter.vo.lectureBank;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class LectureBankVO {

    private Long id;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("lectureId")
    private Long lectureId;
    private List<String> category;
    private String title;
    private String content;
    @JsonProperty("point_value")
    private Long pointValue;
    @JsonProperty("semester_date")
    private String semesterDate;
    private Long hits;
    @JsonProperty("created_at")
    private Timestamp createdAt;
    @JsonProperty("updated_at")
    //private LocalDateTime updatedAt; // 실행도중 에러로 인한 FallBackFactory의 실행을 경험해보고 싶을 때 주석을 해제하고
    private Timestamp updatedAt; // 이걸 주석차리한다.
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    @JsonProperty("is_hit")
    private Boolean isHit;
    private String thumbnail;
}
