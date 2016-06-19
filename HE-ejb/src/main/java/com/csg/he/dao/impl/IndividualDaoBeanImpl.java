package com.csg.he.dao.impl;

import com.csg.he.dao.IndividualDaoBean;
import com.csg.he.model.Individual;
import com.csg.he.util.HibernateUtil;
import org.hibernate.Session;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

/**
 * Created by Alexandr on 18.06.2016.
 */
@Stateless
public class IndividualDaoBeanImpl implements IndividualDaoBean{

    @PersistenceContext
    private EntityManager em;

    private Session session;

    @PostConstruct
    public void init() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void save(Individual individual) {
//        em.persist(individual);
        session.persist(individual);
        session.flush();
    }

    @Override
    public void remove(UUID uuid) {

    }

    @Override
    public void edit(Individual individual) {

    }
}
