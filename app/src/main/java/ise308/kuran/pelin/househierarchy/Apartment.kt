package ise308.kuran.pelin.househierarchy

import android.util.Log

open class Apartment {
    val TAG = "Apartment"

    init {
        Log.i(TAG, "'s being investigating...")
    }

    private val Houses = arrayOf(
        arrayOf("Ali", 3),
        arrayOf("Bugra", 4),
        arrayOf("Pelin", 5)

    )

    fun getResidents() {
        for (House in Houses) {
            print("Residents of this apartment are $House")
        }

    }


}