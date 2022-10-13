package ex03photonpeñaranda;

public class Musicians {
    String name, position; 
    int age;
    
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
