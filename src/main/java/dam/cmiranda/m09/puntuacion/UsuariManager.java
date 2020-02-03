package dam.cmiranda.m09.puntuacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UsuariManager {
    private Map<Integer, Usuari> llistaUser = new ConcurrentHashMap<Integer, Usuari>();
    private AtomicInteger nextId = new AtomicInteger(1);

    public UsuariManager() {
    }

    public List<Usuari> getUsuaris() {
        return new ArrayList<Usuari>(llistaUser.values());
    }

    public void addUser(Usuari user) {
        Integer id = nextId.getAndIncrement();
        user.setId(id);
        llistaUser.put(id, user);
    }

    public void deleteUser(Integer id) {
        llistaUser.remove(id);
    }

    public void updateUser(Usuari user) {
        Integer id = user.getId();
        llistaUser.replace(id, user);
    }
}
