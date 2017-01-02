package com.github.emon.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {

		return Arrays.asList(new Topic("java", "Core Java", "Core Java Course"),
				new Topic("angular", "Angular 2", "Angular 2 Course Quickstart"),
				new Topic("django", " django frawemwork", "Django Frame Work in Detail"));

	}

}
