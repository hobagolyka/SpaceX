package hu.hobagolyka.spacex

import android.app.Activity

val Activity.injector: SpaceXAppComponent
    get() {
        return (this.applicationContext as SpaceXApp).injector
    }