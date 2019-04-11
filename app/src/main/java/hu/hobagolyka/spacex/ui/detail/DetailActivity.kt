package hu.hobagolyka.spacex.ui.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import hu.hobagolyka.spacex.R
import hu.hobagolyka.spacex.injector
import javax.inject.Inject

class DetailActivity : AppCompatActivity(), DetailScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}