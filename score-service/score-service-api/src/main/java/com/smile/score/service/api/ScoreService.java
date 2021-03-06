package com.smile.score.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "score-service")
public interface ScoreService {

    @RequestMapping(value = "/{uid}",method = RequestMethod.GET)
    String getScore(@PathVariable("uid") Long uid);
}
