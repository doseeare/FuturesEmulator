package kg.doseeare.futuresemulator.di

import kg.doseeare.futuresemulator.ui.dashboard.DashboardViewModel
import kg.doseeare.futuresemulator.ui.home.HomeViewModel
import kg.doseeare.futuresemulator.ui.notifications.NotificationsViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(androidApplication()) }
    viewModel { DashboardViewModel(androidApplication()) }
    viewModel { NotificationsViewModel(androidApplication()) }
}