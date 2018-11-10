package com.hi.samplehi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args)
    {
        Configuration config=new Configuration();
        config.configure("config/hibernate.cfg.xml");
        
       SessionFactory sessionFactory=config.buildSessionFactory();
       Session session=sessionFactory.openSession();
       
       studentdetails student=new studentdetails();
       student.setId(100);
       student.setEname("rav");
       student.setFee(3000);
       student.setNum(1234);
       
       Transaction transaction=session.beginTransaction();
       session.save(student);

       studentdetails Id1=(studentdetails)session.get(studentdetails.class,102);
      
 session.delete(Id1);
       
       transaction.commit();
       
       
       session.close();
       sessionFactory.close();
       
       System.out.println("Student details object saved");
         
          }
}