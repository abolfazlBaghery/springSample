package com.example.demo;
import com.example.demo.Entity.student;
import com.example.demo.Entity.userLogin;
import com.example.demo.Repository.MasterRepository;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}




	@Autowired
	private UserLoginRepository userLoginRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private MasterRepository masterRepository;

	public void test() {
//		userLoginRepository.deleteAll();
//		studentRepository.deleteAll();
//		masterRepository.deleteAll();

		final userLogin userLogin = new userLogin();
		userLogin.setUserName("ab.bagheri");
		userLogin.setPassWord("1234567");


		final student student = new student();
		student.setFirstName("abolfazl");
		student.setLastName("bagheri");
		student.setCmId("0015421515");
		student.setStuId("99854784");
		student.setPhone("09121542155");

		student.setUserlogin(userLogin);
		userLogin.setStudent(student);


		userLoginRepository.save(userLogin);
		studentRepository.save(student);

	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		test();
		return String.format("Hello %s!", name);
	}

}
            