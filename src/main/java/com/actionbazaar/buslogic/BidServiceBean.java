package com.actionbazaar.buslogic;

import com.actionbazaar.persistence.Bid;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BidServiceBean implements BidService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addBid(Bid bid) {
        entityManager.persist(bid);
    }

}
