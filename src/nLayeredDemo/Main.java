package nLayeredDemo;



import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.NewAccessDao;

public class Main { 

	public static void main(String[] args) {
	
		// Alt satır normalde Spring IoC ile
		ProductService productService = new ProductManager(new NewAccessDao(),new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		
		productService.add(product);
		
		
		
			

	}

}
