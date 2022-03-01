package com.tngus3722.openfeignstarter.serviceImpl.lectureBank;

import com.tngus3722.openfeignstarter.client.hangang.HangangLectureBankClient;
import com.tngus3722.openfeignstarter.dto.PageDTO;
import com.tngus3722.openfeignstarter.dto.lectureBank.LectureBankDTO;
import com.tngus3722.openfeignstarter.service.lectureBank.LectureBankService;
import com.tngus3722.openfeignstarter.vo.PageVO;
import com.tngus3722.openfeignstarter.vo.lectureBank.LectureBankVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LectureBankServiceImpl implements LectureBankService {

    private final HangangLectureBankClient hangangLectureBankClient;

    @Override
    public PageDTO<LectureBankDTO> getLectureBanks() {
        PageVO<LectureBankVO> pageVO = hangangLectureBankClient.getLectureBanks();
        if (pageVO.getResult() != null) {
            System.out.println(pageVO.getResult().toString());
        }

        return null;
    }
}
