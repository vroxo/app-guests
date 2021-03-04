package com.vitor.roxo.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vitor.roxo.convidados.service.model.GuestModel
import com.vitor.roxo.convidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val mContext = application.applicationContext
    private val mGuestRepository: GuestRepository =
        GuestRepository.getInstance(mContext)

    private var mSaveGuest = MutableLiveData<Boolean>()
    var saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name: String, presence: Boolean) {
        val guest =
            GuestModel(name, presence)
        mGuestRepository.save(guest)
    }
}