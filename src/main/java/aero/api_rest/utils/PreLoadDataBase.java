package aero.api_rest.utils;

import aero.api_rest.models.Category;
import aero.api_rest.models.Product;
import aero.api_rest.repositories.CategoryRepository;
import aero.api_rest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Clase encargada de borrar y agregar datos para la practica.
 * (Tendría que correr sobre el ambiente test realmente sobre una DB en memoria)
 */
@Controller
public class PreLoadDataBase {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public void loadDataBase() {
        System.out.println("DELETE DATABASE..");
        productRepository.deleteAll();

        System.out.println("CREATE DATA..");
        Product chocolinas = new Product();
        chocolinas.setName("Galletitas Chocolate Chocolinas");
        chocolinas.setPrice(new BigDecimal(55));
        chocolinas.setPresentation("170 gr");
        chocolinas.setBrand("Chocolinas");
        chocolinas.setPhoto("https=//challenge-api.aerolab.co/static/products/7790040929906.jpg");
        chocolinas.setOriginalPrice(111.09);
        chocolinas.setUpdatedAt(LocalDate.of(2021, 9,18));
        productRepository.save(chocolinas);

        Product nescafe = new Product();
        nescafe.setName("Cafe Instantaneo Suave NesCafe Dolca");
        nescafe.setPrice(BigDecimal.valueOf(269.9));
        nescafe.setPresentation("175 gr");
        nescafe.setBrand("Nescafé");
        nescafe.setPhoto("https=//challenge-api.aerolab.co/static/products/7613035067837.jpg");
        nescafe.setOriginalPrice(269.9);
        nescafe.setUpdatedAt(LocalDate.of(2021, 8,20));
        productRepository.save(nescafe);

        Product merengadas = new Product();
        merengadas.setName("Galletitas de Vainilla Sabor Frutilla Merengadas");
        merengadas.setPrice(BigDecimal.valueOf(44));
        merengadas.setPresentation("93 gr");
        merengadas.setBrand("Merengadas");
        merengadas.setPhoto("https=//challenge-api.aerolab.co/static/products/7790040932708.jpg");
        merengadas.setOriginalPrice(44);
        merengadas.setUpdatedAt(LocalDate.of(2021, 8,19));
        productRepository.save(merengadas);

        Product wilde = new Product();
        wilde.setName("Caldo de Verduras Wilde");
        wilde.setPrice(BigDecimal.valueOf(45.9));
        wilde.setPresentation("12 un");
        wilde.setBrand("Wilde");
        wilde.setPhoto("https=//challenge-api.aerolab.co/static/products/7794000597723.jpg");
        wilde.setOriginalPrice(45.9);
        wilde.setUpdatedAt(LocalDate.of(2021, 9,10));
        productRepository.save(wilde);

        Product hellmanns = new Product();
        hellmanns.setName("Mayonesa Light Doypack Hellmanns");
        hellmanns.setPrice(BigDecimal.valueOf(55.9));
        hellmanns.setPresentation("237 gr");
        hellmanns.setBrand("Hellmann's");
        hellmanns.setPhoto("https=//challenge-api.aerolab.co/static/products/7794000960145.jpg");
        hellmanns.setOriginalPrice(113.35);
        hellmanns.setUpdatedAt(LocalDate.of(2021, 8,10));
        productRepository.save(hellmanns);

        Product mellizas = new Product();
        mellizas.setName("Galletitas Sabor Vainilla con Relleno de Limon Mellizas");
        mellizas.setPrice(BigDecimal.valueOf(44));
        mellizas.setPresentation("112 gr");
        mellizas.setBrand("Mellizas");
        mellizas.setPhoto("https=//challenge-api.aerolab.co/static/products/7790040930209.jpg");
        mellizas.setOriginalPrice(51.78);
        mellizas.setUpdatedAt(LocalDate.of(2021, 7, 6));
        productRepository.save(mellizas);

        //Categories:

        Category refrigerados = new Category();
        refrigerados.setId((long) 1);
        refrigerados.setName("Refrigerados");
        refrigerados.setParent_id(null);
        categoryRepository.save(refrigerados);

        Category lacteos = new Category();
        lacteos.setId((long) 2);
        lacteos.setName("Lácteos");
        lacteos.setParent_id((long) 1);
        categoryRepository.save(lacteos);

        Category bebidas = new Category();
        bebidas.setId((long) 3);
        bebidas.setName("Bebidas");
        bebidas.setParent_id(null);
        categoryRepository.save(bebidas);

        Category quesosFiambres = new Category();
        quesosFiambres.setId((long) 4);
        quesosFiambres.setName("Quesos y Fiambres");
        quesosFiambres.setParent_id((long) 1);
        categoryRepository.save(quesosFiambres);

        Category frutasVerduras = new Category();
        frutasVerduras.setId((long) 5);
        frutasVerduras.setName("Frutas y Verduras");
        frutasVerduras.setParent_id(null);
        categoryRepository.save(frutasVerduras);

        Category panaderia = new Category();
        panaderia.setId((long) 6);
        panaderia.setName("Panadería");
        panaderia.setParent_id(null);
        categoryRepository.save(panaderia);

        Category carnesPescado = new Category();
        carnesPescado.setId((long) 7);
        carnesPescado.setName("Carnes y Pescado");
        carnesPescado.setParent_id(null);
        categoryRepository.save(carnesPescado);

        Category carnes = new Category();
        carnes.setId((long) 8);
        carnes.setName("Carnes");
        carnes.setParent_id((long) 7);
        categoryRepository.save(carnes);

        Category carneMamiferos = new Category();
        carneMamiferos.setId((long) 9);
        carneMamiferos.setName("Carne de Mamíferos");
        carneMamiferos.setParent_id((long) 8);
        categoryRepository.save(carneMamiferos);

        Category carneFelinos = new Category();
        carneFelinos.setId((long) 10);
        carneFelinos.setName("Carne de Felinos");
        carneFelinos.setParent_id((long) 9);
        categoryRepository.save(carneFelinos);

        Category gatitos = new Category();
        gatitos.setId((long) 11);
        gatitos.setName("Gatitos");
        gatitos.setParent_id((long) 10);
        categoryRepository.save(gatitos);

        Category gatitosMemes = new Category();
        gatitosMemes.setId((long) 11);
        gatitosMemes.setName("Gatitos de memes");
        gatitosMemes.setParent_id((long) 11);
        categoryRepository.save(gatitosMemes);

        Category crema = new Category();
        crema.setId((long) 12);
        crema.setName("Crema Entera");
        crema.setParent_id((long) 2);
        categoryRepository.save(crema);

        System.out.println("DATA BASE READY!");
    }
}
