package com.tts.subsciberlist.subscriber;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

//Tell the JPA that we want to store types of this object to the database
//@Entity(name="SUBSCRIBER")
public class Subscriber {
    
    @Autowired //Tell spring boot to make one of these automatically
    //and stuff it in all SubscriberController objects.
    private SubscriberRepository subscriberRepository;
    
    @Id //Mark the id field as our primary key.
    @GeneratedValue(strategy=GenerationType.AUTO) //id will be auto generated value
    private Long id;
    
    private String firstName;
    private String lastName;
    private String userName;
   
    @Column //attribute is stored in a database table column whose name matches
            //that of the persistent field or property
    @CreationTimestamp //sets the value of the data field to the current time and date
    private Date signedUp;
    
    //This no argument constructor is necessary if we are going to
    //store an @Entity to the database.
    public Subscriber()
    {
        super();
    }
    
    public Subscriber(String firstName, String lastName, String userName, Date signedUp)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedUp = signedUp;
    }
    
    //save users to crud database?
    //public void addSubscriber(Subscriber subscriber)
    //{
    //   subscriberRepository.save(subscriber);
    //}
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
   
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public Date getSignedUp()
    {
        return signedUp;
    }
    public void setSignedUp(Date signedUp)
    {
        this.signedUp = signedUp;
    }
    @Override
    public String toString()
    {
        return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", signedUp=" + signedUp + "]";
    }    
    
}
