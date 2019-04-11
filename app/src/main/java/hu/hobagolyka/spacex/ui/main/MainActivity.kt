package hu.hobagolyka.spacex.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.hobagolyka.spacex.R
import hu.hobagolyka.spacex.injector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen {
    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)

    }

    override fun onStart() {
        super.onStart()
        mainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }
}
