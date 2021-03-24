package com.tts.subsciberlist.subscriber;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long>
{
    @Query("from Subscriber a join a.subscriber c where c.name=:userName")
    public Iterable<Subscriber> findBySubscriber(String userName);
}
  