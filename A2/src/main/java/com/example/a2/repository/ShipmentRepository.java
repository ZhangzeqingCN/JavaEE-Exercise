package com.example.a2.repository;

import com.example.a2.entity.Shipment;
import com.example.a2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment,Integer> {
    Optional<Shipment> findById(Integer id);

    boolean existsByFromUser(User user);

    boolean existsByToUser(User user);

    boolean existsById(Integer id);

    List<Shipment> findByFromUser(User fromUser);

    List<Shipment> findByIdAndFromUserOrToUser(Integer id, User fromUser, User ToUser);

    List<Shipment> findByToUser(User toUser);

    /**
     * 找到某个用户接收的快递
     */
    @Query("select s from Shipment s where s.toUser.id = :userId")
    default List<Shipment> findAllUsersRecPackage(Integer userId) {
        return new ArrayList<>();
    }

    /**
     * 找到某个用户发出的快递
     */
    @Query("select s from Shipment s where s.fromUser.id = :userId")
    default List<Shipment> findAllUsersSendPackage(Integer userId) {
        return new ArrayList<>();
    }
}
