package course.springframework.services;

import java.util.List;

import course.springframework.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

@Service

public class ProductServiceImpl implements ProductService{
	
	public ProductServiceImpl() {
		loadProducts();
		
}

	List<Product> products	 = new ArrayList<Product>();
	
	@Override
	public Product getProduct(int id) {
		for(Product p: products) {
			if(p.getId() == id)
				return p;
		}
		
		return null;
		
		}
		
	@Override
	
	
	public List<Product> listProducts(){
		// TODO Auto-generated method stub
		return products;
		
			
	}
	
	private void loadProducts() {
		
		Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName("DESTINOS");
        springIntro.setCourseSubtitle("DESTINOS TURISTICOS");
        springIntro.setCourseDescription("LOS MEJORES PRECIOS SIEMPRE");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("springIntroThumb.png");
        // Add categories if necessary
        products.add(springIntro);

        Product Product2 = new Product();
        Product2.setId(2);
        Product2.setCourseName("Spring Core Ultimate");
        Product2.setCourseSubtitle("Ultimate Bundle of Spring Core");
        Product2.setCourseDescription("Ultimate guide to Spring Core...");
        Product2.setPrice(new BigDecimal("199"));
        Product2.setImageUrl("springCoreUltimateThumb.png");
        // Add categories if necessary
        products.add(Product2);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf and Spring");
        thymeleaf.setCourseSubtitle("Master Thymeleaf with Spring");
        thymeleaf.setCourseDescription("Comprehensive Thymeleaf course...");
        thymeleaf.setPrice(new BigDecimal("99"));
        thymeleaf.setImageUrl("thymeleafThumb.png");
        // Add categories if necessary
        products.add(thymeleaf);	

        Product Tokio = new Product();
        Tokio.setId(4);
        Tokio.setCourseName("Thymeleaf and Spring");
        Tokio.setCourseSubtitle("TOKIO UWU SEMPAI");
        Tokio.setCourseDescription("Comprehensive Thymeleaf course...");
        Tokio.setPrice(new BigDecimal("99"));
        Tokio.setImageUrl("thymeleafThumb.png");
        // Add categories if necessary
        products.add(Tokio);	
		
        Product Sidney = new Product();	
        Sidney.setId(5);
        Sidney.setCourseName("Thymeleaf and Spring");
        Sidney.setCourseSubtitle("TOKIO UWU SEMPAI");
        Sidney.setCourseDescription("Comprehensive Thymeleaf course...");
        Sidney.setPrice(new BigDecimal("99"));
        Sidney.setImageUrl("thymeleafThumb.png");
        // Add categories if necessary
        products.add(Sidney);	
		
	
	
}
		
}

