package com.hiber.onetomanyhiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Question question1=new Question();
    	question1.setQuestionId(101);
    	question1.setQuestion("What is Java");
    	
    	Answer question1ans1=new Answer();
    	question1ans1.setAnswerid(1);
    	question1ans1.setAnswer("Java is a programming language");
    	question1ans1.setQuestion(question1);
    	
    	Answer question1ans2=new Answer();
    	question1ans2.setAnswerid(2);
    	question1ans2.setAnswer("Java is pure Object oriented language");
    	question1ans2.setQuestion(question1);
    	
    	Answer question1ans3=new Answer();
    	question1ans3.setAnswerid(3);
    	question1ans3.setAnswer("Java is a High level language");
    	question1ans3.setQuestion(question1);
    	
    	
    	
    	
    	//---
    	
    	Question  question2=new Question();
    	question2.setQuestion("What is React JS");
    	question2.setQuestionId(201);
    	
    	Answer question2ans1 =new Answer();
    	question2ans1.setAnswerid(4);
    	question2ans1.setAnswer("React is a open source developed by Facebook");
    	question2ans1.setQuestion(question2);
    	
    	Answer question2ans2=new Answer();
    	question2ans2.setAnswerid(5);
    	question2ans2.setAnswer("React is a JAvascript Library");
    	question2ans2.setQuestion(question2);
    	
    	Answer question2ans3=new Answer();
    	question2ans3.setAnswerid(6);
    	question2ans3.setAnswer("React is used for SPA");
    	question2ans3.setQuestion(question2);
    	
    	
    	List<Answer> ansList1=new ArrayList<Answer>();
    	ansList1.add(question1ans1);
    	ansList1.add(question1ans2);
    	ansList1.add(question1ans3);
    	question1.setAnswers(ansList1);
    	
    	List<Answer> ansList2=new ArrayList<Answer>();
    	ansList2.add(question2ans1);
    	ansList2.add(question2ans2);
    	ansList2.add(question2ans3);
    	question2.setAnswers(ansList2);
    	
    	
    	
    	Session session = factory.openSession();
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(question1);
    		session.save(question1ans1);
    		session.save(question1ans2);
    		session.save(question1ans3);
    		
    		
    		session.save(question2);
    		session.save(question2ans1);
    		session.save(question2ans2);
    		session.save(question2ans3);
    		
    		
    		transaction.commit();
    	
    	session.close();
    	
    	
    }
}
