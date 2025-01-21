package tech.mayanksoni.employeek;

import org.springframework.boot.SpringApplication;

public class TestEmployeekApplication {

    public static void main(String[] args) {
        SpringApplication.from(EmployeekApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
