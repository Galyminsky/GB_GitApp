package me.proton.jobforandroid.gb_rxjava2_dagger2_moxy

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.data.FakeUsersRepoImpl
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.repos.UsersRepo

class App : Application() {
    val usersRepo: UsersRepo by lazy { FakeUsersRepoImpl() }
}

val Context.app: App get() = applicationContext as App
val Fragment.app: App get() = requireContext().applicationContext as App