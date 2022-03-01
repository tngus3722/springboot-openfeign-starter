package com.tngus3722.openfeignstarter.vo;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PageVO<T> {

    private List<T> result;
    private Long count;
}
