package Main;
import java.util.*;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void añadirCiclista (Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }
    
    public void listarEquipo(){
        for (int i=0; i <listaCiclistas.size();i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    
    public void buscarCiclista(){
        Scanner sc=new Scanner(System.in);
        String nombreCiclista = sc.next();
        for(int i=0; i <listaCiclistas.size();i++){
            
            Ciclista c = (Ciclista)listaCiclistas.elementAt(i);
            if(c.getNombre().equals(nombreCiclista)){
                System.out.println(c.getNombre());
            }
                   
        }
    }
    
    public void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {       
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); 
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
    
    public void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}