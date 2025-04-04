
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikas
 */
public class Box implements Packable{
    private ArrayList<Packable> container;
    private double maxWeight;
        
    public Box(double weight) {
        this.maxWeight = weight;
        this.container = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(weight() + item.weight() > this.maxWeight) {
        } else {
            this.container.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item : this.container) {
            weight+=item.weight();
        }
        return weight;
    }
    
     public String toString() {
        return "Box: " + this.container.size() + " items, total weight " + weight() + " kg";
    }
}
