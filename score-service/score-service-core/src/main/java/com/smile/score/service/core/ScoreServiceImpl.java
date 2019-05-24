package com.smile.score.service.core;


import com.smile.score.service.api.ScoreService;
import com.smile.user.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dulei on 18/1/9.
 */
@RestController
public class ScoreServiceImpl implements ScoreService {


    @Autowired
    private UserService userService;

    @Override
    public String getScore(@PathVariable("uid") Long uid) {
        return userService.get(uid).toString();
    }
}
