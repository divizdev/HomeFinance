package ru.divizdev.homefinance.presentation.main.view

import ru.divizdev.homefinance.mvp.IMvpView
import ru.divizdev.homefinance.presentation.main.presenter.TypeSubScreen

interface IMainView: IMvpView {

    fun showAboutDialog()

    fun showSettingsDialog()

    fun showErrorNotAvailable()

    fun openAddTransaction()

    fun openHome()

    fun openWallets()

    fun getOpenTypeScreen(): TypeSubScreen

    fun openTransactions()
}