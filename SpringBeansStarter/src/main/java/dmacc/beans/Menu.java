package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu 
{
	// Instance variables.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private int calories;
	private String ingredients;
	
	// Default constructor.
	public Menu()
	{
		super();
	}
	
	// Constructors.
	public Menu(String name)
	{
		super();
		this.name = name;
	}
	public Menu(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	public Menu(String name, double price, int calories, String ingredients)
	{
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.ingredients = ingredients;
	}
	
	// Getters and setters.
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public int getCalories()
	{
		return calories;
	}
	public void setCalories(int calories) 
	{
		this.calories = calories;
	}
	
	public String getIngredients() 
	{
		return ingredients;
	}
	public void setIngredients(String ingredients) 
	{
		this.ingredients = ingredients;
	}
	
	// Helper methods.
	@Override
	public String toString() 
	{
		return "Menu: Name- " + name + " | Price- " + price + " | Calories- " + calories + " | Ingredients- " + ingredients;
	}
	
}
