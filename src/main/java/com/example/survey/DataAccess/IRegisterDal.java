package com.example.survey.DataAccess;
import com.example.survey.Entities.Register;
import java.util.List;

public interface IRegisterDal {
	List<Register> getAll();
	void add(Register register);
	List<Register> getByTopicId(int topic_id);
	
}
