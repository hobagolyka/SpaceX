package hu.hobagolyka.spacex

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.hobagolyka.spacex.ui.UIModule

class SpaceXApp : Application() {
    lateinit var injector: SpaceXAppComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerSpaceXAppComponent.builder().uIModule(UIModule(this)).build()
    }
}
