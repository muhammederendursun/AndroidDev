package com.med.androiddev.main.di.module

import com.med.androiddev.di.scope.PerActivity
import com.med.androiddev.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @PerActivity
    @Provides
    internal fun provideMainPresenter() = MainPresenter()

}
