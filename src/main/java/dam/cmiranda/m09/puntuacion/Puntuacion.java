package dam.cmiranda.m09.puntuacion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Puntuacion {

    private int id;
    private int puntuacion;

    public Puntuacion() {
    }

    public Puntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Puntuacion(int id, int puntuacion) {
        this.id = id;
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
