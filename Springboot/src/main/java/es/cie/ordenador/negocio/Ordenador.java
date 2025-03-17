package es.cie.ordenador.negocio;

public class Ordenador {
    private int numeroserie;
    private String marca;
    private String modelo;
    private int precio;
    
    public int getNumero() {
        return numeroserie;
    }
    public void setNumero(int numeroserie) {
        this.numeroserie = numeroserie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Ordenador() {
    }
    public Ordenador(int numeroserie, String marca, String modelo, int precio) {
        this.numeroserie = numeroserie;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Ordenador(int numeroserie) {
        this.numeroserie = numeroserie;
    }
    public Object getNumeroserie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumeroserie'");
    }

    

}
