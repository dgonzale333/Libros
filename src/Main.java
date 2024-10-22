public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        libroDAO.agregarLibro(new Libro(1, "Cien Años de Soledad", "Gabriel García Márquez", 1967));
        libroDAO.agregarLibro(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libroDAO.agregarLibro(new Libro(3, "El Principito", "Antoine de Saint-Exupéry", 1943));

        System.out.println("Todos lso libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        Libro libroActualizado = new Libro(2, "Don Quijote", "Miguel de Cervantes Saavedra", 1615);
        libroDAO.actualizarLibro(libroActualizado);

        System.out.println("Libro con ID 2:" + libroDAO.obtenerLibroPorId(2));

        libroDAO.eliminarLibro(1);

        System.out.println("Todos los libros después de la eliminación");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}