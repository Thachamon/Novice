import java.util.ArrayList;

public class Bag {
    
    private ArrayList<Item> items;
    private int limit;

    public Bag(){
        items = new ArrayList<Item>();
        limit = 10;
    }

    public void addItem(String name) {
        if(name.equals("Armor")){
            this.items.add(new Armor(name));
        }
        else if(name.equals("Shoes")){
            this.items.add(new Shoes(name));
        }

    }

    public void showItem() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
    }

}