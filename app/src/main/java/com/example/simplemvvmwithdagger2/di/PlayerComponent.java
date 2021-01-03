package com.example.simplemvvmwithdagger2.di;

import com.example.simplemvvmwithdagger2.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = ViewModelModule.class)
public interface PlayerComponent {

    public void inject(MainActivity mainActivity);
}
