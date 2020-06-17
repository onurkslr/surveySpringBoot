package com.example.survey.DataAccess;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.survey.Entities.Register;

@Repository
public class HibernateRegisterDal implements IRegisterDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateRegisterDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Register> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Register> registers = session.createQuery("from Register",Register.class).getResultList();
		return registers;
	}

	@Override
	@Transactional
	public void add(Register register) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(register);
		
		
	}

	@Override
	@Transactional
	public List<Register> getByTopicId(int topic_id) {
		Session session = entityManager.unwrap(Session.class);
		String hql = " from Register r  where r.topic_id =  :topic_id";
		Query query =session.createQuery(hql);
		query.setParameter("topic_id",topic_id);
		List<Register> results =query.getResultList();
		return results;

		
	}
	
	

}
