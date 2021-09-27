package aero.api_rest.utils;

import aero.api_rest.models.Product;
import aero.api_rest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class PreLoadDataBase {

    @Autowired
    ProductRepository productRepository;

    public void loadDataBase() {
        productRepository.deleteAll();
        System.out.println("DELETE DATABASE..");

        Product chocolinas = new Product();
        chocolinas.setName("Galletitas Chocolate Chocolinas");
        chocolinas.setPrice(55);
        chocolinas.setPresentation("170 gr");
        chocolinas.setBrand("Chocolinas");
        chocolinas.setPhoto("https=//challenge-api.aerolab.co/static/products/7790040929906.jpg");
        chocolinas.setOriginalPrice(111.09);
        chocolinas.setUpdatedAt(LocalDate.of(2021, 9,18));
        productRepository.save(chocolinas);

        Product nescafe = new Product();
        nescafe.setName("Cafe Instantaneo Suave NesCafe Dolca");
        nescafe.setPrice(269.9);
        nescafe.setPresentation("175 gr");
        nescafe.setBrand("Nescafé");
        nescafe.setPhoto("https=//challenge-api.aerolab.co/static/products/7613035067837.jpg");
        nescafe.setOriginalPrice(269.9);
        nescafe.setUpdatedAt(LocalDate.of(2021, 8,20));
        productRepository.save(nescafe);

        Product merengadas = new Product();
        merengadas.setName("Galletitas de Vainilla Sabor Frutilla Merengadas");
        merengadas.setPrice(44);
        merengadas.setPresentation("93 gr");
        merengadas.setBrand("Merengadas");
        merengadas.setPhoto("https=//challenge-api.aerolab.co/static/products/7790040932708.jpg");
        merengadas.setOriginalPrice(44);
        merengadas.setUpdatedAt(LocalDate.of(2021, 8,19));
        productRepository.save(merengadas);

        Product wilde = new Product();
        wilde.setName("Caldo de Verduras Wilde");
        wilde.setPrice(45.9);
        wilde.setPresentation("12 un");
        wilde.setBrand("Wilde");
        wilde.setPhoto("https=//challenge-api.aerolab.co/static/products/7794000597723.jpg");
        wilde.setOriginalPrice(45.9);
        wilde.setUpdatedAt(LocalDate.of(2021, 9,10));
        productRepository.save(wilde);

        Product hellmanns= new Product();
        hellmanns.setName("Mayonesa Light Doypack Hellmanns");
        hellmanns.setPrice(55.9);
        hellmanns.setPresentation("237 gr");
        hellmanns.setBrand("Hellmann's");
        hellmanns.setPhoto("https=//challenge-api.aerolab.co/static/products/7794000960145.jpg");
        hellmanns.setOriginalPrice(113.35);
        hellmanns.setUpdatedAt(LocalDate.of(2021, 8,10));
        productRepository.save(hellmanns);

        /*

    {
      "id"= "7790040930209",
      "name"= "Galletitas Sabor Vainilla con Relleno de Limon Mellizas",
      "price"= 44,
      "presentation"= "112 gr",
      "brand"= "Mellizas",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790040930209.jpg",
      "originalPrice"= 51.78,
      "updatedAt"= "2021-09-06T10=36=57+00=00"
    },
    {
      "id"= "7613034235404",
      "name"= "Cafe Instantaneo Torrado Dolca NesCafe",
      "price"= 208.9,
      "presentation"= "170 gr",
      "brand"= "Nescafé",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7613034235404.jpg",
      "originalPrice"= 208.9,
      "updatedAt"= "2021-08-25T10=36=57+00=00"
    },
    {
      "id"= "7791004000099",
      "name"= "Sal Gruesa en Paquete Celusal",
      "price"= 44.5,
      "presentation"= "1 kg",
      "brand"= "Celusal",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7791004000099.jpg",
      "originalPrice"= 44.5,
      "updatedAt"= "2021-09-09T10=36=57+00=00"
    },
    {
      "id"= "7790360720115",
      "name"= "Picadillo de Carne en Lata Swift",
      "price"= 31.38,
      "presentation"= "90 gr",
      "brand"= "Swift",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790360720115.jpg",
      "originalPrice"= 52.01,
      "updatedAt"= "2021-08-29T10=36=57+00=00"
    },
    {
      "id"= "7790580511609",
      "name"= "Mermelada de Naranja Light Frasco Arcor",
      "price"= 87.5,
      "presentation"= "390 gr",
      "brand"= "Arcor",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790580511609.jpg",
      "originalPrice"= 87.5,
      "updatedAt"= "2021-09-03T10=36=57+00=00"
    },
    {
      "id"= "7622300829643",
      "name"= "Galletitas Vainilla Lincoln Angry Birds",
      "price"= 60,
      "presentation"= "153 gr",
      "brand"= "Lincoln",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7622300829643.jpg",
      "originalPrice"= 115.76,
      "updatedAt"= "2021-09-12T10=36=57+00=00"
    },
    {
      "id"= "7793360800900",
      "name"= "Mermelada de Frutilla La Campagnola",
      "price"= 119,
      "presentation"= "454 gr",
      "brand"= "La campagnola",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7793360800900.jpg",
      "originalPrice"= 119,
      "updatedAt"= "2021-09-08T10=36=57+00=00"
    },
    {
      "id"= "7790040930407",
      "name"= "Galletitas Rellena Amor",
      "price"= 44,
      "presentation"= "112 gr",
      "brand"= "Bagley",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790040930407.jpg",
      "originalPrice"= 63.81,
      "updatedAt"= "2021-09-20T10=36=57+00=00"
    },
    {
      "id"= "7790070318329",
      "name"= "Fideos Tirabuzones Lucchetti",
      "price"= 51.9,
      "presentation"= "500 gr",
      "brand"= "Lucchetti",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790070318329.jpg",
      "originalPrice"= 51.9,
      "updatedAt"= "2021-09-19T10=36=57+00=00"
    },
    {
      "id"= "7790070318282",
      "name"= "Fideos Spaghetti Lucchetti",
      "price"= 52,
      "presentation"= "500 gr",
      "brand"= "Lucchetti",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790070318282.jpg",
      "originalPrice"= 52,
      "updatedAt"= "2021-08-19T10=36=57+00=00"
    },
    {
      "id"= "7790360720382",
      "name"= "Pate de Foie Swift Lata",
      "price"= 43.49,
      "presentation"= "90 gr",
      "brand"= "Swift",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790360720382.jpg",
      "originalPrice"= 43.49,
      "updatedAt"= "2021-09-01T10=36=57+00=00"
    },
    {
      "id"= "7790710000126",
      "name"= "Yerba Mate con Hierbas Serranas Cbse",
      "price"= 156.8,
      "presentation"= "1 kg",
      "brand"= "Cbse",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790710000126.jpg",
      "originalPrice"= 156.8,
      "updatedAt"= "2021-09-10T10=36=57+00=00"
    },
    {
      "id"= "7790580956400",
      "name"= "Salsa Portuguesa Doypack Arcor",
      "price"= 37,
      "presentation"= "340 gr",
      "brand"= "Arcor",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790580956400.jpg",
      "originalPrice"= 37,
      "updatedAt"= "2021-09-19T10=36=57+00=00"
    },
    {
      "id"= "7790070318114",
      "name"= "Fideos Tallarin Don Vicente",
      "price"= 79.05,
      "presentation"= "500 gr",
      "brand"= "Don vicente",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790070318114.jpg",
      "originalPrice"= 79.05,
      "updatedAt"= "2021-09-08T10=36=57+00=00"
    },
    {
      "id"= "7790270336307",
      "name"= "Galletitas Clasicas Mediatarde Pack 3 Un",
      "price"= 52,
      "presentation"= "330 gr",
      "brand"= "Media tarde",
      "photo"= "https=//challenge-api.aerolab.co/static/products/7790270336307.jpg",
      "originalPrice"= 52,
      "updatedAt"= "2021-09-15T10=36=57+00=00"
    }
         */


    }


}
