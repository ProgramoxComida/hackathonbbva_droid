package io.programming4food.meanmachine.models

import android.app.Activity

class MenuOption {
    var title:String = ""
        get() = field
        set(value){ field = value }

    var activity: Activity? = null
        get() = field
        set(value){ field = value }
}