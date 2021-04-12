package com.newhorizons.takeitnow.security.infrastructure.feign;

import com.newhorizons.takeitnow.security.domain.entity.UserApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "users-service")
@RequestMapping("/users")
public interface IUserFeign {
    @GetMapping("/search/findByUsername")
    UserApplication authenticationByUsername(@RequestParam String username);
}