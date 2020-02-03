package dam.cmiranda.m09.puntuacion;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariController {

   UsuariManager user=new UsuariManager();

    @GetMapping("/joc/usuari/{id}")
    public List<Usuari> getUsuaris() {
        return this.user.getUsuaris();
    }

    @PostMapping("/joc/usuari")
    public void addUsuari(@RequestBody Usuari user) {
        this.user.addUser(user);
    }

    @DeleteMapping("/joc/usuari/{id}")
    public void deleteUsuari(@PathVariable Integer id) {
        this.user.deleteUser(id);
    }

    @PutMapping("/joc/usuari")
    public void updateUser(@RequestBody Usuari user) {
        this.user.updateUser(user);
    }

    // --- /joc/usuari
    /*
    nom
    cognom
    dni
    nickname
    */
}
