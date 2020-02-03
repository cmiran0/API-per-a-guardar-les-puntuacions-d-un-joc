package dam.cmiranda.m09.puntuacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Joc {
    private Map<Integer,Partida> llistaPartides = new ConcurrentHashMap<Integer,Partida>();
    private AtomicInteger nextId= new AtomicInteger(1);
    public Joc() {
    }


    public void addPartida(Partida partida) {
        Integer id = nextId.getAndIncrement();
        partida.setId(id);
        llistaPartides.put(id,partida);
    }


    public List<Partida> getPartides() {
        return new ArrayList<Partida>(llistaPartides.values());
    }

    public void deletePartida(Integer id) {
        llistaPartides.remove(id);
    }

    public void updatePartida(Partida partida) {
        Integer id = partida.getId();
        llistaPartides.replace(id,partida);
    }

}
