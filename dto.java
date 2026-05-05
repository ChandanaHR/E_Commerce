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
