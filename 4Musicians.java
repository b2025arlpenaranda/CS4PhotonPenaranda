package ex04photonpeñaranda;

public class Musicians {
    private String name, position; 
    private int age;
    
    @Override
    public String toString() {
        return  "Name: " + name + "\nBand Position: " + position + "\nAge: " + age;
    }
    
    public Musicians(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }
}
