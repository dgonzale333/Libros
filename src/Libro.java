public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int añoPublicaión;

    public Libro(int id, String titulo,String autor, int añoPublicaión) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicaión = añoPublicaión;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAñoPublicaión() {
        return añoPublicaión;
    }

    public void setAñoPublicaión(int añoPublicaión) {
        this.añoPublicaión = añoPublicaión;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" +id +
                ", titulo='" + titulo +'\'' +
                ", autor= '" + autor + '\'' +
                ", añoPublicación=" + añoPublicaión +
                '}';
    }
}
