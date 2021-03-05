package com.vitor.roxo.convidados.service.repository

import android.content.ContentValues
import android.content.Context
import com.vitor.roxo.convidados.service.constants.DataBaseConstants
import com.vitor.roxo.convidados.service.model.GuestModel

class GuestRepository(context: Context) {

    private val mDatabase = GuestDatabase.getDatabase(context).guestDAO()

    fun getAll(): List<GuestModel> {
        return mDatabase.getInvited()
    }

    fun get(id: Int): GuestModel {
        return mDatabase.get(id)
    }

    fun getPresent(): List<GuestModel> {
        return mDatabase.getPresent()
    }

    fun getAbsent(): List<GuestModel> {
        return mDatabase.getAbsent()
    }

    fun save(guest: GuestModel): Boolean {
        return mDatabase.save(guest) > 0
    }

    fun update(guest: GuestModel): Boolean {
        return mDatabase.update(guest) > 0
    }

    fun delete(guest: GuestModel) {
        mDatabase.delete(guest)
    }

}