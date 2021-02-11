package com.example.phase3week1.model;

import com.example.phase3week1.service.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {
    @Autowired
    User current;
    static Session hibernateSession;
    public void initDatabase(){
        try{
             hibernateSession= HibernateUtils
                    .buildSessionFactory()
                    .openSession();
            hibernateSession.beginTransaction();

            User user1 = new User("Adam", "one");
            hibernateSession.save(user1);
            User user2 = new User("Chris", "two");
            hibernateSession.save(user2);
            User user3 = new User("Alex", "three");
            hibernateSession.save(user3);
            User user4 = new User("David", "four");
            hibernateSession.save(user4);
            User user5 = new User("Josh", "one");
            hibernateSession.save(user5);

        } catch(Exception sqlException) {
            sqlException.printStackTrace();
            if (null != hibernateSession.getTransaction()) {
                hibernateSession.getTransaction().rollback();
            }
        }

    }

    public void saveUser(User newuser){
        Transaction transaction=null;
        User user;
        try (Session session=HibernateUtils.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            user=(User)session.createQuery("From User U WHERE U.id = :id")
                    .setParameter("id",newuser.getID()).uniqueResult();
            user.setName(newuser.getName());
            user.setId(newuser.getID());
            session.save(user);
            transaction.commit();
        }catch (Exception e){
            if(transaction !=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public boolean validate(String id){
        boolean result =false;
        Transaction transaction=null;
        User user;
        try (Session session= HibernateUtils.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            user=(User)session.createQuery("From User U WHERE U.id = :id")
                    .setParameter("id",id).uniqueResult();
            if((user !=null)&&(user.getID().equals(id))){
                result=true;
                current=user;
            }
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }

    public User updateUser(){
        return current;
    }
    public User getUser(String id){

        Transaction transaction=null;
        User user=new User("hi","goodbye");
        try (Session session= HibernateUtils.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            user=(User)session.createQuery("From User U WHERE U.id = :id")
                    .setParameter("id",id).uniqueResult();
            if((user ==null)){
                user.setName("not");user.setId("found");
            }
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }
    public boolean update(User oldUser ,String id, String name){
        boolean result =false;
        int oldID=oldUser.getIdent();
        User user;
        Transaction transaction=null;

        try (Session session= HibernateUtils.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            user=(User)session.createQuery("From User U WHERE U.entry = :oldID")
                    .setParameter("id",id).setParameter("username",name);
            if((user !=null)&&(user.getID().equals(id))){
                result=true;
            }
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }

}
