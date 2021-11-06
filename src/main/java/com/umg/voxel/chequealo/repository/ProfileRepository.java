package com.umg.voxel.chequealo.repository;

import com.umg.voxel.chequealo.model.Cuser;
import com.umg.voxel.chequealo.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByUser(Cuser cuser);

    Optional<Employee> findByUser(Cuser cuser);
}
