package com.luolg.web;

import com.luolg.entity.Player;
import com.luolg.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView listGet() {
        ModelAndView modelAndView = new ModelAndView();
        List<Player> players = playerService.listPlayers();
        modelAndView.addObject("players", players);
        modelAndView.setViewName("players-list");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addGet() {
        return "players-add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPost(Player player) {
        System.out.println(player);
        int row = playerService.addPlayer(player);
        System.out.println(row);
        if (row >= 1) {
            return "redirect:/player/list";
        }
        return "fail";
    }

}
