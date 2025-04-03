
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
public class BoxWithMaxHeight extends Box{
    private int maxWeight;
    
    public BoxWithMaxHeight(int capacity) {
        this.maxWeight = capacity;
    }
    
    @Override
    public void add(Item item) {
        if(this.maxWeight >= item.getWeight()) {
            ArrayList list = new ArrayList<Item>();
            list.add(item);
            super.add(list);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return true;
    }
}
