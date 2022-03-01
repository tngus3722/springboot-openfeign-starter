package com.tngus3722.openfeignstarter.dto.lectureBank;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LectureBankDTO {

    private Long id;
    private Long userId;
    private Long lectureId;
    private List<String> category;
    private String title;
    private String content;
    private Long pointValue;
    private String semesterDate;
    private Long hits;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isDeleted;
    private Boolean isHit;
    private String thumbnail;

}
