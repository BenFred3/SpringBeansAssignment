package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Menu;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MenuRepository;

@SpringBootApplication
public class SpringBeansStarterApplication implements CommandLineRunner
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBeansStarterApplication.class, args);
	}
	
	@Autowired
	MenuRepository repo;
	
	@Override
	public void run(String... args) throws Exception
	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Menu m = appContext.getBean("menu", Menu.class);
		m.setName("Fries");
		m.setPrice(1.99);
		repo.save(m);
		
		
		Menu menu = new Menu("Chicken Strips", 2.99, 250, "Chicken, Breading");
		repo.save(menu);
		
		List<Menu> allMyMenus = repo.findAll();
		for(Menu food: allMyMenus)
		{
			System.out.println(food.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
