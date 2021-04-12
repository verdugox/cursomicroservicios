package com.newhorizons.takeitnow.security.infrastructure.repository;

import com.newhorizons.takeitnow.security.domain.entity.UserApplication;
import com.newhorizons.takeitnow.security.domain.repository.IUserRepository;
import com.newhorizons.takeitnow.security.infrastructure.feign.IUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private IUserFeign userFeign;

    public UserApplication authenticationByUsername(String username){
        return userFeign.authenticationByUsername(username);
    }
}
