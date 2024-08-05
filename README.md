# ProyectoGrupal
INDEX.HTML
<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Viaja Con Nosotros</title>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
	<link th:href="@{/css/custom.css}" rel="stylesheet" media="screen">

	<style>
		body {
			font-family: 'Roboto', sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f4f4f4;
			overflow-x: hidden;
		}

		header {
			background: linear-gradient(to right, rgb(128, 128, 255), rgb(128, 128, 255));
			padding: 20px;
			color: white;
			text-align: center;
			box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
		}

		header h1 {
			margin: 0;
			font-size: 2.5em;
		}

		nav ul {
			list-style: none;
			padding: 0;
			margin: 0;
			text-align: center;
		}

		nav ul li {
			display: inline;
			margin: 0 15px;
		}

		nav ul li a {
			color: white;
			text-decoration: none;
			font-size: 1.2em;
			transition: color 0.3s;
		}

		nav ul li a:hover {
			color: #FF6F61;
			text-decoration: underline;
		}

		main {
			padding: 20px;
		}

		#hero {
			background-image: url('https://media.admagazine.com/photos/648205c5d6ffbb9c781e2789/16:9/w_2992,h_1683,c_limit/Avio%CC%81n.jpg');
			background-size: cover;
			background-position: center;
			color: white;
			padding: 60px 20px;
			text-align: center;
			border-radius: 10px;
			margin-bottom: 40px;
			position: relative;
			height: 400px;
			/* Ajusta la altura según sea necesario */
			overflow: hidden;
		}

		#hero::before {
			content: "";
			position: absolute;
			top: 0;
			left: 0;
			width: 100%;
			height: 100%;
			background: rgba(0, 0, 0, 0.5);
			/* Capa de superposición oscura para mejorar la legibilidad del texto */
		}

		#hero h2 {
			font-size: 2.5em;
			margin: 0;
			text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
			position: relative;
			z-index: 1;
		}

		#hero p {
			font-size: 1.2em;
			margin: 20px 0;
			position: relative;
			z-index: 1;
		}

		#hero button {
			background-color: #FF6F61;
			color: white;
			border: none;
			padding: 10px 20px;
			font-size: 1em;
			cursor: pointer;
			border-radius: 5px;
			transition: background-color 0.3s;
			position: relative;
			z-index: 1;
		}

		#hero button:hover {
			background-color: #FF3B30;
		}

		#destinos {
			margin: 20px 0;
			text-align: center;
		}

		#destinos h3 {
			font-size: 2em;
			margin-bottom: 20px;
			color: #4A90E2;
		}

		.destino {
			display: inline-block;
			width: 28%;
			margin: 10px;
			background-color: white;
			border: 1px solid #ddd;
			border-radius: 8px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
			overflow: hidden;
			vertical-align: top;
			transition: transform 0.3s, box-shadow 0.3s;
		}

		.destino:hover {
			transform: translateY(-10px);
			box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
		}

		.destino img {
			width: 100%;
			height: auto;
		}

		.destino h4 {
			font-size: 1.5em;
			margin: 10px 0;
			color: #333;
		}

		.destino p {
			padding: 0 10px 10px;
			color: #666;
		}

		#testimonios {
			background-color: rgb(168, 226, 255);
			padding: 20px;
			text-align: center;
			border-radius: 10px;
			margin-bottom: 40px;
		}

		#testimonios h3 {
			font-size: 2em;
			margin-bottom: 20px;
			color: #4A90E2;
		}

		.testimonio {
			margin: 20px 0;
			background-color: white;
			padding: 20px;
			border-radius: 8px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
			display: inline-block;
			max-width: 500px;
		}

		.testimonio p {
			font-style: italic;
			color: #555;
		}

		.testimonio h4 {
			margin: 10px 0;
			font-weight: bold;
			color: #4A90E2;
		}

		#contacto {
			padding: 20px;
			background-color: rgb(243, 182, 237);
			text-align: center;
			border-radius: 10px;
		}

		#contacto h3 {
			font-size: 2em;
			margin-bottom: 20px;
			color: #4A90E2;
		}

		#contacto form {
			max-width: 600px;
			margin: 0 auto;
			text-align: left;
			background-color: white;
			padding: 20px;
			border-radius: 8px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
		}

		#contacto label {
			display: block;
			margin: 10px 0 5px;
		}

		#contacto input,
		#contacto textarea {
			width: 100%;
			padding: 10px;
			margin-bottom: 10px;
			border: 1px solid rgb(196, 136, 255);
			border-radius: 5px;
		}

		#contacto button {
			background-color: #4A90E2;
			color: white;
			border: none;
			padding: 10px 20px;
			cursor: pointer;
			border-radius: 5px;
			font-size: 1em;
			transition: background-color 0.3s;
		}

		#contacto button:hover {
			background-color: #357ABD;
		}

		.social-icons {
			margin: 20px 0;
		}

		.social-icons a {
			margin: 0 10px;
			display: inline-block;
		}

		.social-icons img {
			width: 30px;
			height: auto;
			transition: transform 0.3s;
		}

		.social-icons a:hover img {
			transform: scale(1.2);
		}

		footer {
			background: linear-gradient(to right, rgb(128, 0, 255), rgb(128, 0, 255));
			color: white;
			text-align: center;
			padding: 10px;
			position: fixed;
			bottom: 0;
			width: 100%;
		}

		@media (max-width: 768px) {
			.destino {
				width: 45%;
			}
		}

		@media (max-width: 480px) {
			.destino {
				width: 90%;
			}

			header h1 {
				font-size: 2em;
			}

			nav ul li {
				display: block;
				margin: 10px 0;
			}

			#hero h2 {
				font-size: 2em;
			}

			#hero p {
				font-size: 1em;
			}
		}
	</style>
</head>

<body>
	<header>
		<h1>AEROLINEA J-DKLI</h1>
		<nav>
			<ul>
				<li><a href="#"><a th:href="@{/product/1}" data-role="course-box-link" href="product.html">DESTINOS</a>
				</li>
				<li><a href="#"><a th:href="@{/paquetes}" data-role="course-box-link" href="product2.html">PAQUETES</a>
				</li>
				<li><a href="#"><a th:href="@{/aerolinea}" data-role="course-box-link"
							href="aerolinea.html">AEROLINEA</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<section id="hero">
			<div>
				<h2>¡Anímate a conocer el resto del mundo con tu familia!</h2>
				<p>Explora destinos exóticos, vive experiencias únicas y crea recuerdos inolvidables.</p>
				<button>¡Descubre más!</button>
			</div>
		</section>
		<section id="destinos">
			<h3>Nuestros Destinos</h3>
			<div class="destino">
				<a th:href="@{/paris}" data-role="course-box-link" href="paris.html">
					<img src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/26/df/67/21/caption.jpg?w=1200&h=-1&s=1"
						alt="Destino 1">
					<h4>PARIS</h4>
					<p>La ciudad del amor y la luz.</p>
				</a>
			</div>
			<div class="destino">
				<a th:href="@{/tokio}" data-role="course-box-link" href="tokio.html">
					<img src="https://www.cloud-europamundo.com/img/carousel/hd/Tokio_20210324155916.jpg"
						alt="Destino 2">
					<h4>TOKIO</h4>
					<p>Una mezcla perfecta de tradición y modernidad.</p>
				</a>
			</div>
			<div class="destino">
				<a th:href="@{/sidney}" data-role="course-box-link" href="sidney.html">
					<img src="https://fotografias.larazon.es/clipping/cmsimages02/2019/08/07/4DA2DAB5-8E42-4872-A15A-4EA75C9CB7F9/98.jpg?crop=1031,580,x0,y50&width=1900&height=1069&optimize=low&format=webply"
						alt="Destino 3">
					<h4>SIDNEY</h4>
					<p>Hermosas playas y una vibrante vida urbana.</p>
				</a>
			</div>
			<div class="destino">
				<a th:href="@{/roma}" data-role="course-box-link" href="roma.html">
					<img src="https://historia.nationalgeographic.com.es/medio/2019/12/11/coliseo-roma_2924b6ae_1280x720.jpg"
						alt="Destino 4">
					<h4>ROMA</h4>
					<p>Historia y arquitectura impresionantes.</p>
				</a>
			</div>
			<div class="destino">
				<a th:href="@{/barcelona}" data-role="course-box-link" href="barcelona.html">
					<img src="https://www.diaridetarragona.com/binrepository/908x506/4c0/900d506/none/15017645/CCYT/barcelona_crop1534490496186_DT201808170002_MG251679226.jpg"
						alt="Destino 5">
					<h4>BARCELONA</h4>
					<p>Arte y cultura vibrante.</p>
				</a>
			</div>
			<div class="destino">
				<a th:href="@{/Ecuador}" data-role="course-box-link" href="Ecuador.html">
					<img src="https://i0.wp.com/passporterapp.com/es/blog/wp-content/uploads/2023/02/Isla-San-Cristobal.jpg?resize=1140%2C641&ssl=1"
						alt="Destino 6">
					<h4>ECUADOR</h4>
					<p>Playas exóticas y paisajes espectaculares.</p>
				</a>
			</div>
		</section>
		<section id="testimonios">
			<h3>Reseñas de nuestros mejores clientes</h3>
			<div class="testimonio">
				<p>“Una experiencia inolvidable. El servicio fue excelente y los destinos espectaculares.”</p>
				<h4>Justin Bieber</h4>
			</div>
			<div class="testimonio">
				<p>“¡La mejor agencia de viajes! Nos ayudaron a planear todo y nos dieron excelentes recomendaciones.”
				</p>
				<h4>Karen Fukuhara</h4>
			</div>
		</section>
		<section id="contacto">
			<h3>Contactanos</h3>
			<form>
				<label for="nombre">Nombre Completo:</label>
				<input type="text" id="nombre" name="nombre" required>
				<label for="telefono">Telefono:</label>
				<input type="text" id="telefono" name="telefono" required>
				<label for="email">Correo Electrónico:</label>
				<input type="email" id="email" name="email" required>
				<label for="mensaje">Descripcion:</label>
				<textarea id="mensaje" name="mensaje" rows="4" required></textarea>
				<button type="submit">Enviar</button>
			</form>
			<div class="social-icons">
				<a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/5/5e/WhatsApp_icon.png"
						alt="WhatsApp"></a>
				<a href="#"><img
						src="https://upload.wikimedia.org/wikipedia/commons/5/51/Facebook_f_logo_%282019%29.svg"
						alt="Facebook"></a>
				<a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/a/a5/Instagram_icon.png"
						alt="Instagram"></a>
			</div>
		</section>
	</main>
	<footer>
		<p>&copy; 2024 Aerolinea J-DKLI. Todos los derechos reservados.</p>
	</footer>
	<script>
		document.querySelector('#hero button').addEventListener('click', function () {
			alert('¡Gracias por tu interés! Pronto tendrás más información.');
		});

		document.querySelector('#contacto form').addEventListener('submit', function (event) {
			event.preventDefault();
			alert('¡Gracias por contactarnos! Te responderemos pronto.');
			this.reset();
		});
	</script>
</body>

</html>

ECUADOR.HTML
<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Viaja Con Nosotros</title>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
	<link th:href="@{/css/custom.css}" rel="stylesheet" media="screen">

	<style>
		body {
			font-family: 'Roboto', sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f4f4f4;
		}

		header {
			background-color: #4A90E2;
			padding: 20px;
			color: white;
			text-align: center;
		}

		header h1 {
			margin: 0;
			font-size: 2.5em;
		}

		main {
			padding: 20px;
		}

		.section {
			margin-bottom: 20px;
		}

		.section h2 {
			font-size: 2em;
			color: #4A90E2;
			margin-bottom: 10px;
		}

		.section p {
			font-size: 1.2em;
			color: #666;
			line-height: 1.6;
		}

		.tourist-spot,
		.dish {
			background-color: white;
			border: 1px solid #ddd;
			border-radius: 8px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
			margin-bottom: 20px;
			overflow: hidden;
			display: flex;
		}

		.tourist-spot img,
		.dish img {
			width: 40%;
			height: auto;
		}

		.info {
			padding: 20px;
			flex: 1;
		}

		.info h3 {
			margin-top: 0;
			color: #333;
		}

		.info p {
			color: #666;
		}

		.accordion {
			cursor: pointer;
			background-color: #4A90E2;
			color: white;
			padding: 10px;
			width: 100%;
			border: none;
			text-align: left;
			outline: none;
			font-size: 1.2em;
			transition: 0.4s;
		}

		.active,
		.accordion:hover {
			background-color: #357ABD;
		}

		.panel {
			padding: 0 18px;
			background-color: white;
			display: none;
			overflow: hidden;
		}
	</style>
</head>

<body>
	<header>
		<h1>Descubre Quito, Ecuador</h1>
	</header>
	<main>
		<section class="section" id="description">
			<h2>DESCRIPCION</h2>
			<p>Quito, la capital de Ecuador, es una ciudad encantadora situada en la cordillera de los Andes. Con su
				centro histórico bien conservado, declarado Patrimonio de la Humanidad por la UNESCO, y su impresionante
				paisaje montañoso, Quito ofrece una mezcla única de historia, cultura y naturaleza.</p>
		</section>

		<section class="section" id="tourist-spots">
			<h2>Lugares Turísticos</h2>
			<button class="accordion">Mitad del Mundo</button>
			<div class="panel">
				<div class="tourist-spot">
					<img src="https://blog.howlanders.com/wp-content/uploads/2021/01/mitad-del-mundo-quito.jpg" alt="Mitad del Mundo">
					<div class="info">
						<h3>Mitad del Mundo</h3>
						<p>El Monumento a la Mitad del Mundo marca el lugar donde se cree que pasa la línea ecuatorial.
							Este icónico sitio turístico permite a los visitantes estar en los hemisferios norte y sur
							al mismo tiempo. Además, el complejo cuenta con museos, tiendas de souvenirs y restaurantes.
						</p>
					</div>
				</div>
			</div>
			<button class="accordion">Centro Histórico de Quito</button>
			<div class="panel">
				<div class="tourist-spot">
					<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW4JtGRzCQqnGc9WNMZZr6ISNaXnTjYm7-2A&s" alt="Centro Histórico de Quito">
					<div class="info">
						<h3>Centro Histórico de Quito</h3>
						<p>El Centro Histórico de Quito es uno de los mejor conservados y más extensos de América
							Latina. Con sus calles empedradas, iglesias barrocas, y plazas coloniales, este área es un
							viaje al pasado. Lugares destacados incluyen la Iglesia de la Compañía de Jesús y la Plaza
							de la Independencia.</p>
					</div>
				</div>
			</div>
			<button class="accordion">Teleférico de Quito</button>
			<div class="panel">
				<div class="tourist-spot">
					<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdL9TI7OWmJLmmxfBbghgRpFVpFzo9fTXv5g&s" alt="Teleférico de Quito">
					<div class="info">
						<h3>Teleférico de Quito</h3>
						<p>El Teleférico de Quito es una de las atracciones más emocionantes de la ciudad, ofreciendo
							vistas panorámicas espectaculares desde el volcán Pichincha. El teleférico asciende hasta
							4,100 metros sobre el nivel del mar, proporcionando una vista impresionante de Quito y sus
							alrededores.</p>
					</div>
				</div>
			</div>
		</section>

		<section class="section" id="typical-dishes">
			<h2>Platos Típicos</h2>
			<button class="accordion">Ceviche</button>
			<div class="panel">
				<div class="dish">
					<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLTdEPPKNLhuoeJ3gvMZRImeRjtS_jNvR7IQ&s" alt="Ceviche">
					<div class="info">
						<h3>Ceviche</h3>
						<p>El Ceviche es un plato popular en la costa ecuatoriana, hecho con mariscos frescos marinados
							en jugo de limón, cebolla, tomate y cilantro. Es refrescante y sabroso, ideal para disfrutar
							en un día caluroso. Se suele acompañar con chifles (plátanos fritos) o maíz tostado.</p>
					</div>
				</div>
			</div>
			<button class="accordion">Encebollado</button>
			<div class="panel">
				<div class="dish">
					<img src="https://bagre.life/wp-content/uploads/2022/11/FB_IMG_1667571956116-Mejorado.jpg" alt="Locro de Papa">
					<div class="info">
						<h3>Encebollado</h3>
						<p>El encebollado, cuyo significado genérico es comida aderezada con mucha cebolla y sazonada con especias, es además un plato típico de Ecuador originario de la región costa. Es considerado el plato insignia de la gastronomía ecuatoriana El encebollado era un plato muy consumido por los estibadores del puerto de Guayaquil, anteriormente conocido como picante de pescado</p>
					</div>
				</div>
			</div>
			<button class="accordion">Yapingacho</button>
			<div class="panel">
				<div class="dish">
					<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYWUtwTyoyVcWLqiI-uGekVVe0yk-EUa8Wtg&s" alt="Empanadas de Viento">
					<div class="info">
						<h3>Yapingacho</h3>
						<p>El yapingacho es un plato tradicional de Ecuador y básicamente consiste en una tortilla de puré con queso, lo que le hace valer para acompañante en las comidas, para desayunos o en si mismos como un plato completo sirviéndolo con un salchichas o chorizo y vegetales. Sigue esta receta fácil y rápida y aprende a cocinar el auténtico yapingacho ecuatoriano.</p>
					</div>
				</div>
			</div>
		</section>
	</main>

	<script>
		var acc = document.getElementsByClassName("accordion");
		for (var i = 0; i < acc.length; i++) {
			acc[i].addEventListener("click", function () {
				this.classList.toggle("active");
				var panel = this.nextElementSibling;
				if (panel.style.display === "block") {
					panel.style.display = "none";
				} else {
					panel.style.display = "block";
				}
			});
		}
	</script>
</body>

</html>

ProductController.java
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
		System.out.println("PAQUETES");
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
		System.out.println("AEROLINEA");
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
		System.out.println("PARIS");
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
		System.out.println("TOKIO");
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
		System.out.println("SIDNEY");
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
		System.out.println("ROMA");
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
		System.out.println("BARCELONA");
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
		System.out.println("ECUADOR");
		var Ecuador = productService.getProduct(2);

		if (Ecuador != null) {
			model.addAttribute("Ecuador", Ecuador);
		} else {
			model.addAttribute("error", "Product not found");
		}

		return "Ecuador";
	}
}

IndexController.java
package course.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}

![image](https://github.com/user-attachments/assets/d5b38615-eada-4d2b-b3d4-27eefd704c4e)
![image](https://github.com/user-attachments/assets/ada1fb67-1595-4712-9bc1-65edc6b3e7c9)
![image](https://github.com/user-attachments/assets/5d6fffa4-e9e4-4a63-a5de-9f718d83b857)
![image](https://github.com/user-attachments/assets/04a14e2c-e265-4599-a456-167ba6f30f5a)
