
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this.equals(obj)) return true;
        if(!this.equals(obj)) return false;
        Item anotherObj = (Item) obj;
        return this.name.equals(anotherObj.name);
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
