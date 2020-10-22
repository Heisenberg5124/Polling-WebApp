package com.anon.pollingappserver.repositories;

import com.anon.pollingappserver.model.Role;
import com.anon.pollingappserver.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
