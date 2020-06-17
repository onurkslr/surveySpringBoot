package com.example.survey.DataAccess;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.survey.Entities.Topic;

@Repository
public class HibernateTopicDal implements ITopicDal {
	
	private EntityManager entityManager;
	@Autowired
	public HibernateTopicDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Topic> getTopicAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Topic> topics = session.createQuery("from Topic",Topic.class).getResultList();
		return topics;
	}

	
	

}
