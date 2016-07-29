package com.spoc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spoc.po.Apply;


@Repository("applyDao")
public class ApplyDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void doApply(Apply apply)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(apply);
		session.getTransaction().commit();
	}
}
