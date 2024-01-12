package day_two;

/**
 * This is codes for the second day of java
 * Animal class
 * Describe the behavor of Animals
 */
public class AnimalFirstclass {
//     Declare Variable
    String name;

    String type;

    int level;

    String color;

    boolean alive;
//    Setter and getter methods
    public void setName( String name){
        this.name = name;
    }
    public String getName(){
    return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }


    public void setLevel(int level){
        this.level = level;

    }

    public int getLevel(){
        return level;
    }

}
