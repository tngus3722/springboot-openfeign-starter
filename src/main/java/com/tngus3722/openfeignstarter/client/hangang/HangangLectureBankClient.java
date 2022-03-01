package com.tngus3722.openfeignstarter.client.hangang;

import com.tngus3722.openfeignstarter.config.feign.FeignErrorDecoder;
import com.tngus3722.openfeignstarter.vo.PageVO;
import com.tngus3722.openfeignstarter.vo.lectureBank.LectureBankVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "hangangLectureBankClient",
        url = "https://api.hangang.in",
        fallbackFactory = HangangLectureBankClientFallbackFactory.class
        //configuration = {FeignErrorDecoder.class} // errorDecoder 등록
)
public interface HangangLectureBankClient {

    @GetMapping("/lecture-banks")
    PageVO<LectureBankVO> getLectureBanks();


    // errorDecoder를 호출해보고 싶을 때 의도적으로 에러를 발생시킨다.
    /*
    @GetMapping("/lecture-banks")
    PageVO<LectureBankVO> getLectureBanks(@RequestParam String page);
     */
}

