import java.util.LinkedList;
import java.util.Queue;

public class PatioAutos {
    Queue<Auto> autos;

    public PatioAutos() {
        autos = new LinkedList<Auto>();
    }

    public Queue<Auto> getAutos() {
        return autos;
    }

    public void encolar(String marca, int anio){
        autos.add(new Auto(marca,anio));
    }

    public Auto desencolar() throws Exception{
        if(autos.isEmpty())
            return new Exception("cola vacia");
        return autos.poll();
    }

    public String listarAutos(){
        String mensaje=" ";
        for(Auto a: autos){
            mensaje += a.toString();
        }
        return mensaje;

    }

    public String listaPorMarca(String marca){
        String mensaje = " ";
        for(Auto a:autos){
            if(a.getMarca().equals(marca))
                mensaje += a.toString();
        }
        return mensaje;
    }

}
