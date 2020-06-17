package com.example.survey.restApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.survey.Entities.*;
import com.example.survey.Business.IRegisterService;

@RestController
@RequestMapping("/api")
public class RegisterController {
	private IRegisterService registerService;

	@Autowired
	public RegisterController(IRegisterService registerService) {
		this.registerService = registerService;
	}
	
	@GetMapping("/surveys")
	public List<Register> get(){
		return registerService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Register register) {	
		registerService.add(register);
	}
	@GetMapping("/surveys/{topic_id}")
	public List<Register> getByTopicId(@PathVariable int topic_id){
		return registerService.getByTopicId(topic_id);
	}
	
}
