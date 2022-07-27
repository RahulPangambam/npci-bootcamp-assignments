package com.npci.ecommercemanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.npci.ecommercemanagement.entities.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Product> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Product> query = session.createQuery("select p from Product p", Product.class);
		
		List<Product> resultList = query.getResultList();
		
		return resultList;
	}

	@Override
	public Product findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	@Transactional
	public void saveOrUpdate(Product p) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(p);
	}

	@Transactional
	public void delete(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("delete from Product p where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
}
