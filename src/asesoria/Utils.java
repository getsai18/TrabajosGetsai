package asesoria;

import java.util.*;

public class Utils {
    public List<Pedido> pedido = new ArrayList<>();
    public List<Pedido> pedidosI = new ArrayList<>();
    public Queue<Pedido> pedidosEstandar, pedidosUrgentes = new ArrayDeque<>();
    public Deque<Pedido> pedidosInvertidos = new ArrayDeque<>();

    public void iniciarPedidos(){
        pedido.add(new Pedido(1, "getsai", "urgenete"));
        pedido.add(new Pedido(2, "jaun", "normal"));
        pedido.add(new Pedido(3, "mario", "urgenete"));
        pedido.add(new Pedido(4, "camilo", "normal"));
        pedido.add(new Pedido(5, "zolano", "urgenete"));
        pedido.add(new Pedido(6, "carlos", "urgenete"));

    }

    public List<Pedido> voltearPedidos(int id, List<Pedido> pedidos, List<Pedido> volteada){
        //pedidosI = pedidos.reversed();
        if(id > pedidos.size() - 1){
            return volteada;
        }
        Pedido p = pedidos.get(id);
        voltearPedidos(id+1, pedidos, volteada);
        return volteada;
    }
}
