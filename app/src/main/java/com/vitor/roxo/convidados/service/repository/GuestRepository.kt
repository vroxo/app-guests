package com.vitor.roxo.convidados.service.repository

import android.content.Context
import com.vitor.roxo.convidados.service.model.GuestModel

class GuestRepository private constructor(context: Context){

    private var mGuestDataBaseHelper: GuestDataBaseHelper = GuestDataBaseHelper(context)

    fun getAll(guest: GuestModel): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository{
            if(::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return GuestRepository(context)
        }
    }

    fun getPresent(guest: GuestModel): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent(guest: GuestModel): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun save(guest: GuestModel) {

    }

    fun update(guest: GuestModel) {

    }

    fun delete(guest: GuestModel) {

    }

}