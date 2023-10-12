public class Auto {
    private String marca;
    private int anio;

    public Auto(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public int comprar(){
        return 60*(2024-anio+1);
    }

    @Override
    public String toString(){
        return "\n*****Auto*****\nMarca: "+
                marca+"\nAnio: "+anio;
    }
}
