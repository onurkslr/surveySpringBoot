package com.example.survey.DataAccess;
import java.util.List;
import com.example.survey.Entities.Topic;

public interface ITopicDal {
	List<Topic> getTopicAll();
	
}
