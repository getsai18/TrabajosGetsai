package asesoria;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Utils u = new Utils();
        u.iniciarPedidos();
        List<Pedido> lista = u.voltearPedidos(0, u.pedido, u.pedidosI);
        
    }
}
