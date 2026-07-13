package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_and_SpringBoot.Entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role> findByName(String name);
}
