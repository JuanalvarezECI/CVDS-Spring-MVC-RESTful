package com.example.servingwebcontent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/juego")
public class JuegoController {
    private Juego juego;

    public JuegoController() {
        juego = new Juego();
    }

    @GetMapping("/inicio")
    public String iniciarJuego(Model model) {
        model.addAttribute("juego", juego);
        return "guest";
    }

    @PostMapping("/adivinar")
    public String adivinarNumero(int intento, Model model) {
        if (intento == juego.getNumeroAdivinar()) {
            model.addAttribute("mensaje", "¡Felicidades! Ganaste $" + juego.getPremio());
        } else {
            juego.reducirPremio();
            model.addAttribute("mensaje", "Intenta de nuevo. Premio actual: $" + juego.getPremio());
        }
        return "resultado";
    }

    @GetMapping("/reset")
    public String reiniciarJuego() {
        juego = new Juego();
        return "redirect:/juego/inicio";
    }
}
