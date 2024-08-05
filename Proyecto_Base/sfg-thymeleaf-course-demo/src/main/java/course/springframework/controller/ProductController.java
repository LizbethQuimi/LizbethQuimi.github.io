package course.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import course.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/paquetes")
	public String getProduct2(Model model) {
		var paquetes = productService.getProduct(2);

		if (paquetes != null) {
			model.addAttribute("paquetes", paquetes);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "product2";
	}

	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable int id, Model model) {
		var product = productService.getProduct(id);

		if (product != null) {
			System.out.println(product.getCourseName());
			model.addAttribute("product", product);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "product";
	}

	@GetMapping("/aerolinea")
	public String getAerolinea(Model model) {
		var aerolinea = productService.getProduct(3);

		if (aerolinea != null) {
			model.addAttribute("aerolinea", aerolinea);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "aerolinea";
	}

	@GetMapping("/paris")
	public String getParis(Model model) {
		var paris = productService.getProduct(2);

		if (paris != null) {
			model.addAttribute("paris", paris);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "paris";
	}

	@GetMapping("/tokio")
	public String getTokio(Model model) {
		var tokio = productService.getProduct(2);

		if (tokio != null) {
			model.addAttribute("tokio", tokio);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "tokio";
	}

	@GetMapping("/sidney")
	public String getSidney(Model model) {
		var sidney = productService.getProduct(2);

		if (sidney != null) {
			model.addAttribute("sidney", sidney);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "Sidney";
	}

	@GetMapping("/roma")
	public String getRoma(Model model) {
		var roma = productService.getProduct(2);

		if (roma != null) {
			model.addAttribute("roma", roma);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "Roma";
	}

	@GetMapping("/barcelona")
	public String getBarcelona(Model model) {
		var barcelona = productService.getProduct(2);

		if (barcelona != null) {
			model.addAttribute("barcelona", barcelona);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "barcelona";
	}
	@GetMapping("/Ecuador")
	public String getEcuador(Model model) {
		var Ecuador = productService.getProduct(2);

		if (Ecuador != null) {
			model.addAttribute("Ecuador", Ecuador);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "Ecuador";
	}
}