package com.example.survey.Business;
import java.util.List;
import com.example.survey.Entities.Register;

public interface IRegisterService {
	List<Register> getAll();
	void add(Register register);
	List<Register> getByTopicId(int topic_id);
}
