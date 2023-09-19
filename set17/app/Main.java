import model.Cajado;
import model.PedraAgua;
import model.PedraAr;
import model.PedraFogo;
import model.PedraTerra;

public class Main {

  public static void main(String[] args) {

    Cajado cajado = new Cajado();

    PedraAgua pedraAgua = new PedraAgua();
    PedraAr pedraAr =  new PedraAr();
    PedraFogo pedraFogo = new PedraFogo();
    PedraTerra pedraTerra = new PedraTerra();
    
    cajado.executarPoderElementar(pedraAgua, pedraAgua);
    
    cajado.executarPoderElementar(pedraAr, pedraAr);
    
    cajado.executarPoderElementar(pedraFogo, pedraFogo);
    
    cajado.executarPoderElementar(pedraTerra, pedraTerra);

    cajado.executarPoderElementar(pedraFogo, pedraAr);

    cajado.executarPoderElementar(pedraFogo, pedraTerra);

    cajado.executarPoderElementar(pedraTerra, pedraAgua);
    
    cajado.executarPoderElementar(pedraAgua, pedraAr);

  }
}
