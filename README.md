# Principios de JPA "Producto"

# Estructura
Este proyecto demuestra una configuración básica de una aplicación Spring Boot con soporte para JPA y PostgreSQL. Tiene las siguientes características:
- Modelo: Representa la entidad Producto.
- Repositorio: Proporciona acceso a la base de datos.
- Servicio: Contiene la lógica de negocio.
- Controlador: Expone una API REST para interactuar con los productos.
- Carga de datos: Inicializa la base de datos con algunos productos.
- Aplicación principal: Arranca la aplicación Spring Boot.

# Modelo
Esta clase Producto representa una entidad JPA que se mapeará a una tabla en la base de datos. Los campos de la clase (id, nombre, descripcion, precio)

# Repositorio
ProductoRepository es una interfaz que extiende JpaRepository, proporcionando métodos CRUD (Crear, Leer, Actualizar, Borrar) básicos y también define métodos personalizados para buscar productos por nombre (conteniendo una subcadena) y por un rango de precios.

# Servicio
ProductoService es una clase de servicio que utiliza ProductoRepository para acceder a los datos. Define métodos para recuperar todos los productos, buscar por ID, buscar por nombre y buscar por rango de precios.

# Controlador
ProductoController es una clase de controlador REST que expone endpoints HTTP para interactuar con los productos. Estos endpoints permiten obtener todos los productos, obtener un producto por ID, buscar productos por nombre y buscar productos por un rango de precios.

# Carga de Datos
CargarDatos es una clase de configuración que se ejecuta al inicio de la aplicación. Inserta algunos productos de ejemplo en la base de datos para tener datos iniciales.

# Ejecución/Testeo
## GET /api/productos
### Navegador
[![imagen-2024-07-16-202809129.png](https://i.postimg.cc/ZRJJWhpB/imagen-2024-07-16-202809129.png)](https://postimg.cc/CZr32XvS)
### Postman
[![imagen-2024-07-16-203054151.png](https://i.postimg.cc/mgM4VrS1/imagen-2024-07-16-203054151.png)](https://postimg.cc/zyJ4G86q)
## GET /api/productos/{id}
### Navegador
[![imagen-2024-07-16-203137352.png](https://i.postimg.cc/cH1NsBGf/imagen-2024-07-16-203137352.png)](https://postimg.cc/t1cckPTg)
### Postman
[![imagen-2024-07-16-203207485.png](https://i.postimg.cc/RFPxqJvy/imagen-2024-07-16-203207485.png)](https://postimg.cc/VrbVV6rW)
## GET /api/productos/search?nombre={nombre}
### Navegador
[![imagen-2024-07-16-203259272.png](https://i.postimg.cc/J0vw5wDQ/imagen-2024-07-16-203259272.png)](https://postimg.cc/GTFSb5jB)
### Postman
[![imagen-2024-07-16-203330561.png](https://i.postimg.cc/CLnpLKXr/imagen-2024-07-16-203330561.png)](https://postimg.cc/w7zGw96D)
## GET /api/productos/searchByPrecio?preciomin={preciomin }&preciomax={ preciomax}
### Navegador
[![imagen-2024-07-16-203410819.png](https://i.postimg.cc/MGxCDmTg/imagen-2024-07-16-203410819.png)](https://postimg.cc/pmGcV8KB)
### Postman
[![imagen-2024-07-16-203442083.png](https://i.postimg.cc/Ssxw0Qcr/imagen-2024-07-16-203442083.png)](https://postimg.cc/Y4TXYHnG)
