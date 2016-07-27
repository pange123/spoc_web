package com.spoc.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.spoc.po.User;
@SuppressWarnings("unused")
public class UserDao
{
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory(String hql, String[] strings) {
        return sessionFactory;
    }
	
	@SuppressWarnings("rawtypes")
	public boolean find(String username,String password)
	{
		System.out.println("UserDao.find()");
		boolean flag=false;		
		String hql="from User u where u.username='"+username+"' and u.password='"+password+"'";
		Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);

        //使用List方法.
        List userList = query.list();
        Iterator it=userList.iterator();
        if(it.hasNext())
	     {
	    	 flag=true;
	     }
        
        
        //迭代器去迭代.
       /* for(Iterator iter=userList.iterator();iter.hasNext();)

        {

           User user =(User)iter.next();

           System.out.println("id="+user.getId() + "name="+user.getUsername());

        }*/
		
	     return flag;
	
	}
	
}
