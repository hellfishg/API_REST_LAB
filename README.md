# API_REST_LAB
API REST en Java Spring

------------------------
## PRODUCTOS:

URL: https://aero-rest-api.herokuapp.com/products/

Descripción: Trae todos los productos con el precio en dólares actualizado.

Peticion: GET

Autentificacion: Ninguna.

Respuesta https: 200 OK

Ejemplo de respuesta:
```
  {
        "id": 1,
        "name": "Galletitas Chocolate Chocolinas",
        "price": 55.00,
        "presentation": "170 gr",
        "brand": "Chocolinas",
        "photo": "https=//challenge-api.aerolab.co/static/products/7790040929906.jpg",
        "originalPrice": 111.09,
        "updatedAt": "2021-09-18",
        "dollarPrice": 1.21
    },
    {
        "id": 2,
        "name": "Cafe Instantaneo Suave NesCafe Dolca",
        "price": 269.90,
        "presentation": "175 gr",
        "brand": "Nescafé",
        "photo": "https=//challenge-api.aerolab.co/static/products/7613035067837.jpg",
        "originalPrice": 269.9,
        "updatedAt": "2021-08-20",
        "dollarPrice": 5.92
    },
    {
        "id": 3,
        "name": "Galletitas de Vainilla Sabor Frutilla Merengadas",
        "price": 44.00,
        "presentation": "93 gr",
        "brand": "Merengadas",
        "photo": "https=//challenge-api.aerolab.co/static/products/7790040932708.jpg",
        "originalPrice": 44.0,
        "updatedAt": "2021-08-19",
        "dollarPrice": 0.96
    },
...
```
-------------------------

URL: https://aero-rest-api.herokuapp.com/products/new_products 

Descripción: Trae los productos nuevos (En este caso al menos un mes atrás)

Peticion: GET

Autentificacion: Ninguna.

Respuesta https: 200 OK

Ejemplo de respuesta:
```
[
    {
        "id": 1,
        "name": "Galletitas Chocolate Chocolinas",
        "price": 55.00,
        "presentation": "170 gr",
        "brand": "Chocolinas",
        "photo": "https=//challenge-api.aerolab.co/static/products/7790040929906.jpg",
        "originalPrice": 111.09,
        "updatedAt": "2021-09-18"
    },
    {
        "id": 4,
        "name": "Caldo de Verduras Wilde",
        "price": 45.90,
        "presentation": "12 un",
        "brand": "Wilde",
        "photo": "https=//challenge-api.aerolab.co/static/products/7794000597723.jpg",
        "originalPrice": 45.9,
        "updatedAt": "2021-09-10"
    }
]
```
-------------------------
URL: https://aero-rest-api.herokuapp.com/products/create

Descripción: Crea un nuevo producto (Autogenera ID, y fecha de creación)

Peticion: POST

Autentificacion: Ninguna.

Respuesta https: 201 CREATED

Ejemplo Body:
```
{
    "name": "Las galletitas mas fea de la historia",
    "price": 56.5,
    "presentation": "170 gr",
    "brand": "Surtidas Bagley",
    "photo": "https://challenge-api.aerolab.co/static/products/7790040929906.jpg",
    "originalPrice": 1.09
}
```
Ejemplo de respuesta:
```
{
    "id": 7,
    "name": "Las galletitas mas fea de la historia",
    "price": 56.5,
    "presentation": "170 gr",
    "brand": "Surtidas Bagley",
    "photo": "https://challenge-api.aerolab.co/static/products/7790040929906.jpg",
    "originalPrice": 1.09,
    "updatedAt": "2021-09-28"
}
```
-------------------------
## CATEGORIAS:

URL: https://aero-rest-api.herokuapp.com/categories

Descripción: Trae todas las categorías.

Peticion: GET

Autentificacion: Ninguna.

Respuesta https: 200 OK

Ejemplo de respuesta:
```
[
    {
        "id": 1,
        "name": "Refrigerados",
        "parent_id": null
    },
    {
        "id": 2,
        "name": "Lácteos",
        "parent_id": 1
    },
    {
        "id": 3,
        "name": "Bebidas",
        "parent_id": null
    },
...
```
---------------------------
URL: https://aero-rest-api.herokuapp.com/categories/category_tree

Descripción: Trae todas las categorías, ordenadas en árbol

Peticion: GET

Autentificacion: Ninguna.

Respuesta https: 200 OK

Ejemplo de respuesta:
```
{
        "id": 7,
        "name": "Carnes y Pescado",
        "parent_id": null,
        "subcategories": [
            {
                "id": 8,
                "name": "Carnes",
                "parent_id": 7,
                "subcategories": [
                    {
                        "id": 9,
                        "name": "Carne de Mamíferos",
                        "parent_id": 8,
                        "subcategories": [
                            {
                                "id": 10,
                                "name": "Carne de Felinos",
                                "parent_id": 9,
                                "subcategories": []
                            }
                        ]
                    }
                ]
            }
        ]
    }
]
...
```
-----------------------

URL: https://aero-rest-api.herokuapp.com/categories/create

Descripción: Crea una nueva categoría (Regresa 406 si el parent_id no concuerda con una categoría existente)

Peticion: POST

Autentificacion: Ninguna.

Respuesta https: 201 CREATED

Ejemplo body sin parent_id:
```
{
    "id": 38,
    "name": "Patitos darks",
    "parent_id": null,
    "subcategories": []
}
```
Ejemplo body con parent_id existente:
```
{
    "id": 38,
    "name": "Patitos darks",
    "parent_id": 37,
    "subcategories": []
}
```
Ejemplo de respuesta:
```
{
    "id": 38,
    "name": "Patitos darks",
    "parent_id": null,
    "subcategories": []
}
```
