package com.med.androiddev.base

abstract class BasePresenter<out T> {
    private var view: T? = null

    abstract fun initialise()
    abstract fun disposeSubscriptions()

    fun getView(): T? = view

    @Suppress("UNCHECKED_CAST")
    fun attachView(view: Any?) {
        this.view = view as T?
    }

    fun detachView() {
        view = null
    }
}