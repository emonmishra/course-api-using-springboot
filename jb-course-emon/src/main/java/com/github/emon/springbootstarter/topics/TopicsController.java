package com.github.emon.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {

		return topicService.getAllTopics();
	}

}
