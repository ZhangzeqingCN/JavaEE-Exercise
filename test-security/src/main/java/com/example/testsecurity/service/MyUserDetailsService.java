package com.example.testsecurity.service;

import com.example.testsecurity.domain.MyUserDetails;
import com.example.testsecurity.entity.MyUser;
import com.example.testsecurity.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("Loading user: " + username + Objects.equals(username, "zzq"));

        if (!Objects.equals(username, "zzq")) {
            throw new UsernameNotFoundException(username);
        }

        return MyUserDetails.builder()
                .user(MyUser.builder()
                        .name(username)
                        .password("{noop}123123")
                        .build())
                .build();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
