package hu.hobagolyka.spacex.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.hobagolyka.spacex.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
