package com.github.emon.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("java", "Core Java", "Core Java Course"),
			new Topic("angular", "Angular 2", "Angular 2 Course Quickstart"),
			new Topic("django", " django frawemwork", "Django Frame Work in Detail"));

	public List<Topic> getAllTopics() {

		return topics;
	}
	
	public Topic getTopic(String id){
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
