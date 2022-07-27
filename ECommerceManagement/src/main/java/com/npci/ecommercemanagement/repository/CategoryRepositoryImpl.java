package com.npci.ecommercemanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.npci.ecommercemanagement.entities.Category;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Category> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Category> query = session.createQuery("select c from Category c", Category.class);
		
		List<Category> resultList = query.getResultList();
		
		return resultList;
	}

	@Override
	public Category findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Category.class, id);
	}

	@Transactional
	public void saveOrUpdate(Category c) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(c);
	}

	@Transactional
	public void delete(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("delete from Category c where categoryId = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
}
