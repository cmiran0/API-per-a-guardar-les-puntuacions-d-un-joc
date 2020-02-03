package dam.cmiranda.m09.puntuacion;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JocController {
    Joc joc = new Joc();

    @GetMapping("/joc/puntuacio")
    public List<Partida> getJoc() {
        return this.joc.getPartides();
    }

    @PostMapping("/joc/puntuacio")
    public void addJoc(@RequestBody Partida partida) {
        this.joc.addPartida(partida);
    }

    @DeleteMapping("/joc/puntuacio/{id}")
    public void deletePartida(@PathVariable Integer id){
        this.joc.deletePartida(id);
    }

    @PutMapping("/joc/puntuacio")
    public void updatePartida(@RequestBody Partida partida) {
        this.joc.updatePartida(partida);
    }

    // --- /joc/usuari
    /*
    nom
    cognom
    dni
    nickname
    */

}
