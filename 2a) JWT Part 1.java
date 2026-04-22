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

//dto
//AuthResponse.java
package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
	private String token;
	private String email;
	private String name;
	private String role;
}
//LoginRequest.java
package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
}
//RegisterRequest.java
package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
	@NotBlank(message = "Name is required")
	private String Name;
	
	@Email(message = "Enter a valid email")
	@NotBlank(message = "Email is required")
	private String email;
	
	@Size(min=6, message="Password must be atleast 6 characters")
	@NotBlank(message = "Password is required")
	private String password;
}
