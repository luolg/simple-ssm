package com.luolg.service.impl;

import com.luolg.dao.PlayerDao;
import com.luolg.entity.Player;
import com.luolg.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;


    @Override
    public List<Player> listPlayers() {
        return playerDao.queryAllPlayers();
    }

    @Override
    public int addPlayer(Player player) {
        return playerDao.addPlayer(player);
    }

}
