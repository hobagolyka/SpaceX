package hu.hobagolyka.spacex

import dagger.Component
import hu.hobagolyka.spacex.ui.UIModule
import hu.hobagolyka.spacex.ui.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class])
interface SpaceXAppComponent {
    fun inject(mainActivity: MainActivity)
}

