package com.java.cr.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.cr.model.Employ;
import com.java.cr.model.Login;
import com.java.cr.util.EncryptPassword;
import com.java.cr.util.SessionHelper;

public class EmployDaoImpl implements EmployDao{
	
	SessionFactory sessionFactory;
	Session session;

	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria (Employ.class);
		return cr.list();
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = SessionHelper.getConnection(); 
		Session session = sessionFactory.openSession();		 
		Criteria cr = session.createCriteria (Employ.class);		 
		cr.add(Restrictions.eq("empno", empno));		 
		Employ employ = (Employ)cr.uniqueResult();		 
		return employ;
	}

	@Override
	public List<String> showName() {
		sessionFactory = SessionHelper.getConnection();		
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria (Employ.class);
		Projection projection=Projections.property("ename");
		cr.setProjection(projection);
		List<String> strList = cr.list();
		System.out.println(strList.size());
		return strList;
	}

	@Override
	public Double totalSalary() {
		sessionFactory = SessionHelper.getConnection();		
		Session session = sessionFactory.openSession();
		double salary = (Double) session.createCriteria (Employ.class).setProjection(Projections.sum("basic")).uniqueResult();
		return salary;
	}

	@Override
	public Long totalRecords() {
		sessionFactory = SessionHelper.getConnection();		
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria (Employ.class).setProjection(Projections.rowCount());
		Long count =(Long)cr.uniqueResult();
		return count;
	}

	@Override
	public String addUser(Login login) {
		String encr=EncryptPassword.getCode(login.getPassCode());
		login.setPassCode(encr);
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(login);
		trans.commit();
		return "User Account Added...";
		
		
	}
	
	public int authentication(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		login.setPassCode(encr);
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria (Login.class);		 
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", encr));
		Login loginFound = (Login)cr.uniqueResult();
		if (loginFound!=null) {
			return 1;
		}
		return 0;	
		
	}
	
	public List<Employ> showDeptDetails(String dept) {		 
		sessionFactory = SessionHelper.getConnection();		 
		Session session = sessionFactory.openSession();		 
		Criteria cr = session.createCriteria (Employ.class);		 
		cr.add(Restrictions.eq("dept", dept));		 
		return cr.list();
		 
	}
	
		 
	public List<String> showDept() {
		 
		sessionFactory = SessionHelper.getConnection();		 
		Session session = sessionFactory.openSession();		 
		Criteria cr = session.createCriteria (Employ.class);		 
		Projection projection = Projections.distinct(Projections.property("dept"));		 
		cr.setProjection (projection);		 
		List<String> list = cr.list();		 
		return list;
		 
	}
	
	

}
