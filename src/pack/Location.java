package pack;

/**
 * Created by sziszka on 2017.09.29..
 */
public class Location {

    private String name;
    private Location next = null;

    public Location(String name){
        this.name = name;
        if(!Logic.locs.contains(this)){
            Logic.locs.add(this);
        }
    }

    public Location(){

    }

    public Location getBefore(){
        return this.next;
    }

    public void setBefore(Location location){
        this.next=location;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
