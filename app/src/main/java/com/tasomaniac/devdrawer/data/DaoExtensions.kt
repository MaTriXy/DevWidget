package com.tasomaniac.devdrawer.data

import io.reactivex.Completable

fun Dao.insertWidget(widget: Widget): Completable =
    Completable.fromAction {
      insertWidgetSync(widget)
    }

fun Dao.updateWidget(widget: Widget): Completable =
    Completable.fromAction {
      updateWidgetSync(widget)
    }

fun Dao.insertFilters(appWidgetId: Int, packageMatchers: List<String>): Completable =
    Completable.fromAction {
      val filters = packageMatchers.map {
        Filter(it, appWidgetId)
      }
      insertFilterSync(filters)
    }

fun Dao.insertApps(appWidgetId: Int, packageNames: List<String>): Completable =
    Completable.fromAction {
      val apps = packageNames.map {
        App(it, appWidgetId)
      }
      insertAppSync(apps)
    }

fun Dao.deleteWidgets(vararg widgets: Widget): Completable = Completable.fromAction {
  deleteWidgetsSync(*widgets)
}