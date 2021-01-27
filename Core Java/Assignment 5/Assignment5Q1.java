package JavaFiles;

import java.util.*;
import java.util.stream.Collectors;
class Fruit {
    public String name;
    private int calories;
    private int price;
    private String color;
    public Fruit(String name, int calories, int price, String color) {
    	this.name = name;
    	this.calories = calories;
    	this.price = price;
    	this.color = color;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getCalories() {
    	return calories;
    }

    public void setCalories(int calories) {
    	this.calories = calories;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public String getColor() {
    	return color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
   
}

public class Assignment5Q1 {

    public static List<Fruit> reverseSort(ArrayList<Fruit> fruits)
    {
    	ArrayList<Fruit> Fruits=(ArrayList<Fruit>) fruits.stream().filter(p->p.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
    	return Fruits;
    }
    
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) 
    {
    	ArrayList<Fruit> Fruits=(ArrayList<Fruit>) fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
		return Fruits;
	}
    
    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits)
    {
    	ArrayList<Fruit> Fruits=(ArrayList<Fruit>) fruits.stream().filter(p->p.getColor()=="Red").sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
    	return Fruits;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
        Fruits.add(new Fruit("Custard Apple",1000,100,"Green"));
        Fruits.add(new Fruit("Water melon",10,50,"Light Green"));
        Fruits.add(new Fruit("oranges",30,100,"Orange"));
        Fruits.add(new Fruit("Apple",400,200,"Red"));
        Fruits.add(new Fruit("Pomegranate",75,400,"Red"));
        
        ArrayList<Fruit> Fruit1=new ArrayList<Fruit>();
        Fruit1=(ArrayList<Fruit>) reverseSort(Fruits);
        Fruit1.forEach((fruit)-> { System.out.println(fruit.getName()+"--"+fruit.getCalories()); });
        
        System.out.print("\n");
        
        ArrayList<Fruit> Fruit2=new ArrayList<Fruit>();
        Fruit2=(ArrayList<Fruit>) sort(Fruits);
        Fruit2.forEach((fruit)-> { System.out.println(fruit.getName()+"--"+fruit.getColor()); });
        
        System.out.print("\n");
        
        ArrayList<Fruit> Fruit3=new ArrayList<Fruit>();
        Fruit3=(ArrayList<Fruit>) filterRedSortPrice(Fruits);
        Fruit3.forEach((fruit)-> { System.out.println(fruit.getName()+"--"+fruit.getPrice()); });
   
     }

}
