package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyAndEmployeeFacadeTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyAndEmployeeFacade companyAndEmployeeFacade;

    @Test
    void testFindEmployeeByName() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee niuniaClarkson = new Employee("Niunia", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee usagiKovalevitz = new Employee("Usagi", "Kovalevitz");
        Employee lindaKoval = new Employee("Linda", "Koval");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarkson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(usagiKovalevitz);
        employeeDao.save(niuniaClarkson);
        employeeDao.save(lindaKoval);
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company grey50shades = new Company("Grey & 50 shades");
        Company greyDorian = new Company("Grey Dorian & CO");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyDorian);
        companyDao.save(grey50shades);
        companyDao.save(greyMatter);

        //when & then
        companyAndEmployeeFacade.findByText("Koval");

        //clean up

        employeeDao.deleteAll();

    }
}
