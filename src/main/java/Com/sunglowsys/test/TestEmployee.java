package Com.sunglowsys.test;

import Com.sunglowsys.confi.ApplicationConfiguration;
import Com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Employee employee = (Employee) context.getBean(Employee.class);

        System.out.println();
        employee.setFirstName("mohit");

        System.out.println("employee Name : " +employee.getFirstName());
        System.out.println();
        employee.newAddress();
    }
}
