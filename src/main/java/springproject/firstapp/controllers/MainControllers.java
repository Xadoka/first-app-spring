package springproject.firstapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springproject.firstapp.db.DBManager;
import springproject.firstapp.models.Item;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("i", DBManager.getItems());
        return "home";
    }
}
