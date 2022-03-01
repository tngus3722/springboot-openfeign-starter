package com.tngus3722.openfeignstarter.config.feign;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        System.out.println("decode run");

        return new Exception("test");
    }
}
