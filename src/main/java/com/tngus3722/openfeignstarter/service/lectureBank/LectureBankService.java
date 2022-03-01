package com.tngus3722.openfeignstarter.service.lectureBank;

import com.tngus3722.openfeignstarter.dto.PageDTO;
import com.tngus3722.openfeignstarter.dto.lectureBank.LectureBankDTO;

public interface LectureBankService {

    PageDTO<LectureBankDTO> getLectureBanks();
}
