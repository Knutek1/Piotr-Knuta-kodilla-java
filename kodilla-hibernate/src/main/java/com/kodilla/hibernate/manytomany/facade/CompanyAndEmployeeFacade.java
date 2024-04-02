package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyAndEmployeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);
    private final CompanyDao companyDao;

    private final EmployeeDao employeeDao;

    @Autowired
    public CompanyAndEmployeeFacade(CompanyDao companyDao,EmployeeDao employeeDao){
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void findByText(String text){
        LOGGER.info("Trying to find text in Company names");
        companyDao.findByNameContaining(text);
        LOGGER.info("Trying to find text in Employee lastnames");
        employeeDao.findByLastnameContaining(text);
    }


}
