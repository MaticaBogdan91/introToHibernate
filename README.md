Book Project using HIBERNATE 

In this project I used Java + Hibernate +  MySQL
 
Main purpose of this project is to create the connexions betwen some Book Authors - and some Books , some Books ware written by some Author and some of then written
by another Author ,

We use Session Factory witch generate sessions = from HibernateUtils.getSessionFactory() ,  always at final we use session.close();

I can delete a book , create a book , update a book and get a book , same with the authors all by ID 

I used DAO , witch is :  The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism) using an abstract API.

I used Java Faker  witch is a library used to generate fake data. It provides different classes and methods in order to generate real-looking data that ranges from mobile number, address, music, nation and many more. This is really helpful when we want to use some placeholder but don't have actual da

Important thing is in hibernate.cfg.xml to always make sure that your class is mapped , by mapping clas  = " entity.Example.java"/>

