package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class NewAccessDao implements ProductDao{
 
	@Override
	public void add(Product product) {
		System.out.println("NewAccess ile eklendi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("NewAccess ile güncellendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("NewAccess ile silindi");
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
