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
