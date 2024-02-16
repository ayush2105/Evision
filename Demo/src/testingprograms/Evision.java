package testingprograms;

public class Evision {
    double salary;

    public Evision() {
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return this.salary;
    }


    public static class Employee extends Evision {
        String name;
        String Address;
        String Course;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}

