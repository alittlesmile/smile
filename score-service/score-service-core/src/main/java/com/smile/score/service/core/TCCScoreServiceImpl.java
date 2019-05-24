package com.smile.score.service.core;


import com.smile.score.service.api.TCCScoreService;
import lombok.extern.slf4j.Slf4j;
import org.bytesoft.compensable.Compensable;
import org.bytesoft.compensable.CompensableCancel;
import org.bytesoft.compensable.CompensableConfirm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dulei on 18/1/9.
 */
@Slf4j
@Compensable(interfaceClass = TCCScoreService.class,simplified = true)
@RestController
public class TCCScoreServiceImpl implements TCCScoreService {


    private Logger log= LoggerFactory.getLogger(TCCScoreServiceImpl.class);

    @Override
    @Transactional
    public String reduceScore(Integer score) {
        log.info("try reduce Score ");
        return "3";
    }


    @CompensableConfirm
    @Transactional
    public String reduceScoreConfirm(Integer score) {
        log.info("reduceScoreConfirm : [{}]",score);
        return "4";
    }



    @CompensableCancel
    @Transactional
    public String reduceScoreCancle(Integer score) {
        log.info("reduceScoreCancle : [{}]",score);
        return "5";
    }



}
