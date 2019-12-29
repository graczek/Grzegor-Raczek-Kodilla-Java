package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
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
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

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
    public void testQueryFindEmployeeByLastName() {
        //given
        Employee johnWayne = new Employee("John", "Wayne");
        Company softwareMachines = new Company("Software Machines");
        softwareMachines.getEmployees().add(johnWayne);
        johnWayne.getCompanies().add(softwareMachines);

        //when
        employeeDao.save(johnWayne);
        int johnWayneId = johnWayne.getId();
        List<Employee> employeesWithLastName = employeeDao.retrieveEmployeesByLastname("Wayne");
        Employee employeeFound = employeesWithLastName.get(0);

        //then
        Assert.assertEquals(1, employeesWithLastName.size());
        Assert.assertTrue(employeeFound.getLastname().contains("Wayne"));

        //CleanUp
        employeeDao.deleteById(johnWayneId);

    }

    @Test
    public void testQueryFindCompanyBySubstring() {
        //given
        Employee johnRambo = new Employee("John", "Rambo");
        Company softwareMachines = new Company("Software Machines");
        softwareMachines.getEmployees().add(johnRambo);
        johnRambo.getCompanies().add(softwareMachines);

        //when
        companyDao.save(softwareMachines);
        int softwareMachinesId = softwareMachines.getId();

        List<Company> companiesWithThreeFirstLetters = companyDao.retrieveCompaniesByFirstThreeLetters("Sof");
        Company companyFound = companiesWithThreeFirstLetters.get(0);

        //Then
        Assert.assertEquals(1, companiesWithThreeFirstLetters.size());
        Assert.assertTrue(companyFound.getName().contains("Machines"));

        //CleanUp
        companyDao.deleteById(softwareMachinesId);



    }
}