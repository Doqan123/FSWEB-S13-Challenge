package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {

        if(giro < 0){
            System.out.println("Ciro negatif değer olamaz");
            this.giro = 0;
        } else {this.giro = giro;}

        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name){

        if(index < 0 || index > developerNames.length ){
            System.out.println("Geçerli bir indeks numarası girin!");
        } else {
            if(developerNames[index] == null){
                this.developerNames[index] = name;
            } else {
                System.out.println("Bu index zaten dolu");
            }
        }

    }

}
