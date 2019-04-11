package hu.hobagolyka.spacex.ui

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.hobagolyka.spacex.ui.main.MainPresenter
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter() = MainPresenter()
}