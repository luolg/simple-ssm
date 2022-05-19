package com.luolg.dao;

import com.luolg.entity.Player;

import java.util.List;

public interface PlayerDao {
    public List<Player> queryAllPlayers();

    public int addPlayer(Player player);

}
