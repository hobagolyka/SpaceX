package hu.hobagolyka.spacex.ui.main

import hu.hobagolyka.spacex.ui.Presenter

class MainPresenter : Presenter<MainScreen>() {

    fun showList(mission: String) {
        screen?.showMissions(mission)
    }
}