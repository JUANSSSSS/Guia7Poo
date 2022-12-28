
package ejer1pooo.entidades;

public class libro {
    private String titulo ;
    private String autor ;
    private int isbn ;
    private int paginas ;

    public libro() {
    }

    public libro(String titulo, String autor, int isbn, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
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

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", paginas=" + paginas + '}';
    }
    
       
            
    
}
