package com.example.survey.Business;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey.DataAccess.ITopicDal;
import com.example.survey.Entities.Topic;
@Service
public class TopicManager implements ITopicService {
	
	private ITopicDal topicDal;
	EntityManager entityManager;

	
	@Autowired
	public TopicManager(ITopicDal topicDal) {
		this.topicDal = topicDal;
	}


	@Override
	@Transactional
	public List<Topic> getTopicAll() {
		return this.topicDal.getTopicAll();
	}

	

}
