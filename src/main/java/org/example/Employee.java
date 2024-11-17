package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
    public String getFullName(){return this.fullName;}

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if(index < 0 || index >= healthPlans.length) {
            System.out.println("Geçerli bir indeks numarası girin!");
        }else{
            if(healthPlans[index] == null){
                this.healthPlans[index] = name;
            } else {
                System.out.println("Bu index zaten dolu. Mevcut health plan: '" + healthPlans[index] + "'.");
            }
        }
    }
}
