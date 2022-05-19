package com.luolg.service;

import com.luolg.dao.PlayerDao;
import com.luolg.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {

    public List<Player> listPlayers(
    );

    public int addPlayer(Player player);
}
