package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    void testFindEmployeeByName(){
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee niuniaClarkson = new Employee("Niunia", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee usagiKovalevitz = new Employee("Usagi","Kovalevitz");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarkson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(usagiKovalevitz);
        employeeDao.save(niuniaClarkson);
        //when
        List<Employee> employeesWithName = employeeDao.findByName("Clarkson");
        //then
        assertEquals(2,employeesWithName.size());
        //clean up
        employeeDao.deleteAll();

    }
    @Test
    void testFindCompanyByFirstThreeLetters(){
        //given
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
        //when
        List<Company>listCompaniesWithThreeLetters = companyDao.findByFirstThreeLetters("gre");
        //then
        assertEquals(3,listCompaniesWithThreeLetters.size());
        //clean up
        companyDao.deleteAll();

    }
}