# -Principios de JPA-Producto-

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

# Ejecución
