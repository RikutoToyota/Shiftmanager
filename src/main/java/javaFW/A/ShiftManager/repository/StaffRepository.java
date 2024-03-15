package javaFW.A.ShiftManager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaFW.A.ShiftManager.model.StaffModel;

@Repository
public interface StaffRepository extends JpaRepository<StaffModel, Integer> {
    Optional<StaffModel> findByNameseiAndNamemeiAndPassword(String namesei, String namemei, String password);
    Optional<StaffModel> findByNameseiAndNamemei(String namesei, String namemei);
    boolean existsByAddressOrTell(String address, String tell);
    Optional<StaffModel> findByAddress(String address);
}