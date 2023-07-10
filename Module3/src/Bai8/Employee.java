package Bai8;

class Employee extends Person {
    private double salaryCoefficient;

    public Employee(String fullName, String address, double salaryCoefficient) {
        super(fullName, address);
        this.salaryCoefficient = salaryCoefficient;
    }

    public double calculateSalary() {
        // Assume there is a fixed base salary
        double baseSalary = 1000;
        return baseSalary * salaryCoefficient;
    }

    public String evaluate() {
        double salary = calculateSalary();
        if (salary >= 2000) {
            return "High";
        } else if (salary >= 1000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    public String toString() {
        return super.toString() + "\nSalary Coefficient: " + salaryCoefficient +
               "\nSalary: " + calculateSalary() + "\nEvaluation: " + evaluate();
    }
}