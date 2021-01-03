package com.example.simplemvvmwithdagger2.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.example.simplemvvmwithdagger2.di.DaggerPlayerComponent;
import com.example.simplemvvmwithdagger2.pojo.Player;
import com.example.simplemvvmwithdagger2.di.PlayerComponent;
import com.example.simplemvvmwithdagger2.viewmodel.PlayerViewModel;
import com.example.simplemvvmwithdagger2.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    ViewModelProvider.Factory factory;

    PlayerViewModel playerViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlayerComponent playerComponent = DaggerPlayerComponent.create();
        playerComponent.inject(this);
        playerViewModel = ViewModelProviders.of(this,factory).get(PlayerViewModel.class);
        playerViewModel.getPlayerMutableLiveData().observe(this, new Observer<Player>() {
            @Override
            public void onChanged(Player player) {
                Log.d("ahmed", "onChanged: "+player);
            }
        });
    }
}