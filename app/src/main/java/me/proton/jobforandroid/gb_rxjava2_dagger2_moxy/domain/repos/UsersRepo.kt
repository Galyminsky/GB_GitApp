package me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.repos

import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.entities.UserEntity

interface UsersRepo {
    fun getUsers(
        onSuccess: (List<UserEntity>) -> Unit,
        onError: ((Throwable) -> Unit)? = null
    )
}