package com.csg.he;

import com.csg.he.dao.IndividualDaoBean;
import com.csg.he.model.Individual;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 * Created by Alexandr on 18.06.2016.
 */
@ManagedBean
@SessionScoped
public class IndividualBean {

    public IndividualBean() {
    }

    private String individualName;

    @EJB
    private IndividualDaoBean individualDaoBean;

    public void saveBtnListener(ActionEvent event) {
        //Сохранение в базу данных
        Individual individual = new Individual(individualName);
        individualDaoBean.save(individual);

        //Вывод на консоль
        System.out.println("Сохранено! Имя физ. лица: " + individualName);
    }

    public String getIndividualName() {
        return individualName;
    }

    public void setIndividualName(String individualName) {
        this.individualName = individualName;
    }
}
