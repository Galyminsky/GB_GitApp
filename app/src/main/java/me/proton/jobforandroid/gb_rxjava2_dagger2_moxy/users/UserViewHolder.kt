package me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.R
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.databinding.ItemUserBinding
import me.proton.jobforandroid.gb_rxjava2_dagger2_moxy.domain.entities.UserEntity

class UserViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
) {
    private val binding = ItemUserBinding.bind(itemView)

    fun bind(userEntity: UserEntity) {
        binding.avatarImageView.load(userEntity.avatarUrl)
        binding.loginTextView.text = userEntity.login
        binding.uidTextView.text = userEntity.id.toString()
    }

}