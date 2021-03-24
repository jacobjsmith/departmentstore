package com.jacobstuff.departmentstore.dto;

public class SalaryGradesDTO {

    private int salaryGradeId;
    private int lowSalary;
    private int highSalary;

    public int getSalaryGradeId() {
        return salaryGradeId;
    }

    public void setSalaryGradeId(int salaryGradeId) {
        this.salaryGradeId = salaryGradeId;
    }

    public int getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(int lowSalary) {
        this.lowSalary = lowSalary;
    }

    public int getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(int highSalary) {
        this.highSalary = highSalary;
    }
}
