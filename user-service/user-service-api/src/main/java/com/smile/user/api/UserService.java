package com.smile.user.api;

import com.smile.user.dto.UserDTO;
import com.smile.user.dto.UsernameAndPasswordDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(method = RequestMethod.POST)
    UserDTO getByUsernameAndPasswordDTO(UsernameAndPasswordDTO usernameAndPasswordDTO);


    @RequestMapping(value = "/{uid}",method = RequestMethod.GET)
    UserDTO get(@PathVariable("uid") Long uid);

}
