package com.example.simplemvvmwithdagger2.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.simplemvvmwithdagger2.pojo.Player;

import javax.inject.Inject;

public class PlayerRepository {
    MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();
    Player player;
@Inject
    public PlayerRepository(Player player) {
        this.player = player;
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        playerMutableLiveData.setValue(player);
        return playerMutableLiveData;
    }
}
