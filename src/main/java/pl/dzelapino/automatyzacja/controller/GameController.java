package pl.dzelapino.automatyzacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.dzelapino.automatyzacja.model.Game;
import pl.dzelapino.automatyzacja.service.IGameService;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private IGameService gameService;

    @GetMapping("/api/games")
    public String getGames(Model model) {

        var games = (List<Game>) gameService.findAll();

        model.addAttribute("games", games);

        return "games";

    }

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello";
    }

}
