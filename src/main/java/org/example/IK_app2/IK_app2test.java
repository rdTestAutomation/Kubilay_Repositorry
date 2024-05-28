package org.example.IK_app2;

public class IK_app2test {
    public static void main(String[] args) {

        Department itDepartment = new Department("IT Department");

        itDepartment.addEmployee(new Person("Kubilay", "Test Engineer"));
        itDepartment.addEmployee(new Person("Hakan", "Software Developer"));
        itDepartment.addEmployee(new Person("Nagihan", "System Adminisrator"));

        System.out.println("Employees in " + itDepartment.getName() + ":");
        for (Person person : itDepartment.getEmployees()){
            System.out.println(person);
        }
    }
}
