package AnimalRescuer;

public class Dog {
   private String name;
   private int age;
    private String breed;
    private String color;
   private double weight;
    private String gender;
    public String talk;
    public String eat;

    public void setTalk(String talk) {
       this.talk=talk;
    }
    public String getTalk(){
        return talk;
    }

    public void setEat(String eat) {
        this.eat=eat;
    }
    public String getEat(){
        return eat;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}