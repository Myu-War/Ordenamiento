package ordenamiento;

public class Pelicula implements Comparable<Pelicula>{
    
    public int id;
    public int año;
    public String nombre;
    
    public Pelicula(){
        
    }
    
    public Pelicula(int id, int año, String nombre){
        this.id=id;
        this.año=año;
        this.nombre=nombre;
    }

    public int compareTo(Pelicula t) {
        return this.nombre.compareTo(t.nombre); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();

        cad.append("Título: " + nombre);
        cad.append("   Año: " + año+"\n");

        return cad.toString();
    }
}
