package com.csg.he.dao;

import com.csg.he.model.Individual;

import javax.ejb.Local;
import java.util.UUID;

/**
 * Created by Alexandr on 18.06.2016.
 */
@Local
public interface IndividualDaoBean {
    void save(Individual individual);
    void remove(UUID uuid);
    void edit(Individual individual);
}
