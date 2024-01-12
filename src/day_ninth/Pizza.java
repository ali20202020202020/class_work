package day_ninth;

public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    Pizza(String size, int cheese, int pepperoni, int ham){
        this.size = size;
        this.cheese = cheese;
        this.pepperoni =pepperoni;
        this.ham =ham;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setCheese( int cheese){
        this.cheese = cheese;
    }

    public void setPepperoni (int pepperoni){
        this.pepperoni = pepperoni;
    }

    public void setHam (int ham){
        this.ham = ham;
    }

    public String getSize(){
        return this.size;
    }
    public int getCheese(){
        return this.cheese;
    }
    public int getPepperoni(){
        return this.pepperoni;
    }
    public int getHam(){
        return this.ham;
    }

    public double calCost(){
        double cost = 0;
        if(size.equals("small")){
            cost = 10;
        }
        else if(size.equals("medium")){
            cost = 12;
        }
        else if(size.equals("large")){
            cost = 14;
        }
       return cost += (ham + cheese +pepperoni)*2;


    }

    public String getDescription(){
        return ("The pizza size is: "+size+" and has :"+cheese+ " Cheese " +pepperoni+ " Pepperoni " + ham+ " Ham" );
    }
}
