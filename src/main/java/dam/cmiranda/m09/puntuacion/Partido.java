package dam.cmiranda.m09.puntuacion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Partido {

    private Map<Integer, Puntuacion> puntuacion;
    private AtomicInteger nextId;

    public Partido() {
        puntuacion = new ConcurrentHashMap<>();
        nextId = new AtomicInteger(1);
    }

    public Map<Integer, Puntuacion> getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Map<Integer, Puntuacion> posts) {
        puntuacion = posts;
    }

    public void addPuntuacion(int punt) {
        Integer id = nextId.getAndIncrement();
        puntuacion.put(id, new Puntuacion(id, punt));
    }

    public void addPuntuacion(int id, int punt) {
        Integer id1 = nextId.getAndIncrement();
        puntuacion.put(id1, new Puntuacion(id, punt));
    }
}
