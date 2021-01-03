package com.example.simplemvvmwithdagger2.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.simplemvvmwithdagger2.di.ViewModelKey;
import com.example.simplemvvmwithdagger2.pojo.Player;
import com.example.simplemvvmwithdagger2.viewmodel.PlayerViewModel;
import com.example.simplemvvmwithdagger2.viewmodelFactory.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PlayerViewModel.class)
    public abstract ViewModel bindAuthViewModel(PlayerViewModel viewModel);

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

    @Provides
    static Player providesPlay(){
        return new Player();
    }
}
