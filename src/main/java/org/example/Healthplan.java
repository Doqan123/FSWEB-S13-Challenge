package org.example;

import com.sun.source.tree.BreakTree;
import org.example.enums.Plan;

public class Healthplan {
    private  int id;
    private  String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    public String getName(){return this.name;}
    public int getId(){return this.id;}

    public Plan getPlan() {
        return plan;
    }
}
