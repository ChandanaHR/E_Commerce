//pom.xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.5</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>

  Add JWT secret to application.properties
jwt.secret = Radha@15@Krishna@02@Madhav@20@Gopala@00@
jwt.expiration = 86400000 

  // Repsitories
  //UserRepository.java
  package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_and_SpringBoot.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
	boolean existsByEmail(String email);
}

//RoleRepository.java
package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_and_SpringBoot.Entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role> findByName(String name);
}

