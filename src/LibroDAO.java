import java.util.List;


public interface LibroDAO {
    void agregarLibro(Libro libro);
    List<Libro> obtenerTodosLosLibros();
    Libro obtenerLibroPorId (int id);
    void actualizarLibro (Libro libro);
    void eliminarLibro(int id);
}
