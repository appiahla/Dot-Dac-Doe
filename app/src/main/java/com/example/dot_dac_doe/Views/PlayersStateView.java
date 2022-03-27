package com.example.dot_dac_doe.Views;

import com.example.dot_dac_doe.Models.Player;

import java.util.Map;

public interface PlayersStateView {
    void setCurrentPlayer(Player player);

    void setPlayerPoints(Map<Player, Integer> player_points_map);

    void setWinner(Player winner);
}
