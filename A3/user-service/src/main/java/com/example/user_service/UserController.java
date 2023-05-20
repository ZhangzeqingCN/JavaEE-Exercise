package com.example.user_service;


import com.example.user_service.dao.UserRepository;
import com.example.user_service.dto.GetOrderByNameDto;
import com.example.user_service.dto.Result;
import com.example.user_service.entity.Order;
import com.example.user_service.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class UserController {
    private RestTemplate restTemplate;
    private UserRepository userRepository;

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private Integer servicePort;

    @GetMapping("/")
    public String getDefaultMessage() {
        return getMessage();
    }

    @GetMapping("/{id}")
    public Result getUser(@PathVariable String id) {
        return Result.builder()
                .success(true)
                .data(User.builder()
                        .id(id)
                        .build())
                .build();
    }


    @GetMapping("/message")
    public String getMessage() {
        return String.format("This is %s:%d", serviceName, servicePort);
    }

    @GetMapping("/other-message")
    public String getOtherServiceMessage() {
        log.info("This is {}:{}", serviceName, servicePort);
        return restTemplate.getForObject("http://order-service/message", String.class);
    }

    @GetMapping("getOrderByName/{name}")
    public Result getOrderByName(GetOrderByNameDto getOrderByNameDto) {
        var result = new Result();
//        if (!userRepository.existsByName(getOrderByNameDto.getName())) {
//            result.setSuccess(false);
//            result.setMessage("User not found");
//            return result;
//        }
        var userOptional = userRepository.findByName(getOrderByNameDto.getName());
//        var user = userOptional.get();

        result.setSuccess(true);
        var user = User.builder().id("99999").build();

        Result orderResult = restTemplate.getForObject(String.format("http://order-service/%s", user.getId()), Result.class);

        result.setData(orderResult);

        return result;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
