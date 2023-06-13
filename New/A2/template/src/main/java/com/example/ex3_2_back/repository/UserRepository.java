package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;


@RepositoryRestResource(path = "UserRepository")
@Tag(name = "UserRepository")
public interface UserRepository extends JpaRepository<User, String> {
    @Operation(summary = "通过用户名查找")
    @RestResource(path = "findByName")
    Optional<User> findByName(String name);

    @Operation(summary = "通过用户名和密码查找出一个用户")
    @RestResource(path = "findByNameAndPassword")
    Optional<User> findByNameAndPassword(String name, String password);

    @Operation(summary = "是否存在名字")
    @RestResource(path = "existsByName")
    boolean existsByName(String name);

    @Operation(summary = "是否存在用户名和密码")
    @RestResource(path = "existsByNameAndPassword")
    boolean existsByNameAndPassword(String name, String password);

    @Operation(summary = "通过用户名删除用户", responses = @ApiResponse())
    @RestResource(path = "deleteByName")
    boolean deleteByName(String name);
}
