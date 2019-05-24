package com.smile.score.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "score-service")
public interface TCCScoreService {

    @RequestMapping(value = "/aa",method = RequestMethod.GET)
    String reduceScore(@RequestParam("score") Integer score);

}
