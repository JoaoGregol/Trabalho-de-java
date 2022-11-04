import java.util.ArrayList;
import java.util.List;

public class Lista {
    public List<String> ListaTarefa(){
        List<String> lista = new ArrayList<>();
        for(int l = 1; l < 13; l++){
            lista.add("Comprar Carvão "+l);
        }
        return lista;
    }
}
