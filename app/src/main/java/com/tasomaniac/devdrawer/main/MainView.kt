package com.tasomaniac.devdrawer.main

import android.content.Context
import android.os.Build.VERSION_CODES.O
import android.support.annotation.RequiresApi

interface MainView {

  fun updateItems(items : List<WidgetListData>, diffCallbacks: WidgetDiffCallbacks)
  fun setListener(listener: Listener?)

  interface Listener {

    @RequiresApi(O)
    fun onAddNewWidgetClicked(context: Context)
  }
}