package com.example.survey.Business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.survey.DataAccess.IRegisterDal;
import com.example.survey.Entities.Register;

@Service
public class RegisterManager implements IRegisterService {
	
	private IRegisterDal registerDal;
	
	@Autowired
	public RegisterManager(IRegisterDal registerDal) {
		this.registerDal = registerDal;
	}

	@Override
	@Transactional
	public List<Register> getAll() {
		return this.registerDal.getAll();
	}

	@Override
	@Transactional
	public void add(Register register) {
		 this.registerDal.add(register);
		
	}

	@Override
	@Transactional
	public List<Register> getByTopicId(int topic_id) {
		return this.registerDal.getByTopicId(topic_id);
	}
	

}
