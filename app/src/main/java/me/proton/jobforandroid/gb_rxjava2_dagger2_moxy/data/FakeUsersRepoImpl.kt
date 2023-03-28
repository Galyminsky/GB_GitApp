package me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.data

import android.os.Handler
import android.os.Looper
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.entities.UserEntity
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.repos.UsersRepo

private const val DATA_LOADING_FAKE_DELAY = 3_000L

class FakeUsersRepoImpl : UsersRepo {

    private val data: List<UserEntity> = listOf(
        UserEntity("Oleg", 1, "https://avatars.githubusercontent.com/u/1?v=4"),
        UserEntity("Ivan", 2, "https://avatars.githubusercontent.com/u/2?v=4"),
        UserEntity("Maks", 3, "https://avatars.githubusercontent.com/u/3?v=4"),
    )

    override fun getUsers(onSuccess: (List<UserEntity>) -> Unit, onError: ((Throwable) -> Unit)?) {
        Handler(Looper.getMainLooper()).postDelayed({
            onSuccess(data)
        }, DATA_LOADING_FAKE_DELAY)
    }

}