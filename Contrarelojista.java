package Main;

public class Contrarelojista extends Ciclista{
    private double velocidadMáxima;

    public Contrarelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    public double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    
    protected void imprimir() {
        super.imprimir(); 
        System.out.println("Aceleración promedio = " + velocidadMáxima);
    }
    
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
    
}
