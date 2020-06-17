package com.example.survey.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.survey.Business.ITopicService;
import com.example.survey.Entities.*;

@RestController
@RequestMapping("/api")
public class TopicController {
	private ITopicService topicService;

	@Autowired
	public TopicController(ITopicService topicService) {
		this.topicService = topicService;
	}
	@GetMapping("/topics")
	public List<Topic> get(){
		return topicService.getTopicAll();
	}

}
