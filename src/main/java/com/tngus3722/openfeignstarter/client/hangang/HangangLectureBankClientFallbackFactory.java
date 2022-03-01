package com.tngus3722.openfeignstarter.client.hangang;

import com.tngus3722.openfeignstarter.vo.PageVO;
import com.tngus3722.openfeignstarter.vo.lectureBank.LectureBankVO;
import feign.FeignException;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

// circuit이 open된 경우 혹은 실행도중 에러가 발생한 경우에 실행된다.
@Component
public class HangangLectureBankClientFallbackFactory implements FallbackFactory<HangangLectureBankClient> {

    @Override
    public HangangLectureBankClient create(Throwable cause) {
        String httpStatus = cause instanceof FeignException ? Integer.toString(((FeignException) cause).status()) : "";

        return new HangangLectureBankClient() {
            @Override
            public PageVO<LectureBankVO> getLectureBanks() {
                System.out.println(String.format("httpStatus: %s, message: %s", httpStatus, cause.getMessage()));
                return new PageVO<>();
            }
        };
    }
}
