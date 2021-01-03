package com.example.simplemvvmwithdagger2.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.simplemvvmwithdagger2.pojo.Player;
import com.example.simplemvvmwithdagger2.repository.PlayerRepository;

import javax.inject.Inject;

public class PlayerViewModel extends ViewModel {
    MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();
    private Player player;
    private PlayerRepository playerRepository;
    @Inject
    public PlayerViewModel(PlayerRepository playerRepository) {
        player = new Player("ahmed","ahly","play maker");
        playerRepository = new PlayerRepository(player);
        this.playerRepository = playerRepository;
        playerMutableLiveData = playerRepository.getPlayerMutableLiveData();
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        return playerMutableLiveData;
    }
}
