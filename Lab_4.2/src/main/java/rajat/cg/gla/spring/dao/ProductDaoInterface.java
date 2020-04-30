package rajat.cg.gla.spring.dao;

import java.util.List;

import rajat.cg.gla.spring.entity.Product;
import rajat.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
	//public List<ProductOld> retrieve();
	List<ProductOld> retrieve();

}
