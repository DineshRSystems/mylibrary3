package com.visioncritical.mylibrary3

import android.util.Log

class LibraryTest private constructor() {

    private object HOLDER {
        val INSTANCE = LibraryTest()
    }

    companion object {
        val shared: LibraryTest by lazy { HOLDER.INSTANCE }
    }

    fun testLog(message: String) {
        Log.d("LibraryTest", message)
    }
}