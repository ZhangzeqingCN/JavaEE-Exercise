package com.example.a2;

import com.example.a2.entity.User;
import com.example.a2.security.MySecurity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Objects;

@SpringBootTest
@Slf4j
public class SecurityTests {
    MySecurity mySecurity;

    @Autowired
    public void setMySecurity(MySecurity mySecurity) {
        this.mySecurity = mySecurity;
    }

    @Test
    void testSecurity() {
        var a = User.builder().id(231).build();
        assert a.getId() != null;
        var token = mySecurity.genToken(a);
        var b = mySecurity.decToken(token);
        assert b.isPresent();
        assert Objects.equals(a.getId(), b.get().getId());
    }

    @Test
    void testCalendar() {
        var a = Calendar.getInstance().getTime().toString();
        log.info(a);
    }

    @Test
    void testGenToken() {
        var token = mySecurity.genExpiredToken(User.builder().id(1).build(), Calendar.YEAR, 100);
        log.info(token);
    }

}
