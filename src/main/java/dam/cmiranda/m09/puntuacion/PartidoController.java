package dam.cmiranda.m09.puntuacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartidoController {

    private Partido partido = new Partido();

    @PostMapping("/juego/puntuaciones")
    public void addPuntuacion(@RequestBody Puntuacion puntuacion) {
        this.partido.addPuntuacion(puntuacion.getId(), puntuacion.getPuntuacion());
    }

    @GetMapping("/juego/puntuaciones")
    public Partido getPartido() {
        return this.partido;
    }


}
