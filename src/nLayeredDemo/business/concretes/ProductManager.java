package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.JLoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
 
	
	private ProductDao productDao; 			 //business kısmı ile data access kısmı birbirne bağlı olamaz
	private JLoggerService loggerService;   //ancak interfacesine bağlayabilirsin
	
	public ProductManager(ProductDao productDao,JLoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService; 
	}
 
	@Override
	public void add(Product product) {
		
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
		
		//entityler hariç bir şeyi newlemek genelde sorun yaratır
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
