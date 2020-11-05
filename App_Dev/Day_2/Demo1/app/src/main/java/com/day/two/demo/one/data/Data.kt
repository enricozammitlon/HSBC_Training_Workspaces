package com.day.two.demo.one.data

import com.day.two.demo.one.errors.NameDoesNotExistException
import com.day.two.demo.one.errors.NameExistsException
import kotlin.random.Random

class Data {
    var joinedList = mutableListOf<String>()
    var maleNames = listOf("Luke","Enrico","Ali","Hamza")
    var femaleNames = listOf("Lucy","Jennifer","Sumaya","Mai")
    init {
        joinedList.addAll(maleNames)
        joinedList.addAll(femaleNames)
    }

    fun listBase() : String {
        // this
        var r2 = (1..joinedList.size).random()
        // vs this
        val random = Random
        var r = random.nextInt(joinedList.count())
        return joinedList[r]
    }

    fun addName(newName : String){
        if(!joinedList.contains(newName)){
            joinedList.add(newName)
        }
        else{
            throw NameExistsException("Name already exists!")
        }
    }

    fun removeName(newName : String){
        if(joinedList.contains(newName)){
            joinedList.remove(newName)
        }
        else{
            throw NameDoesNotExistException("Name is not in list!")
        }
    }

    fun getList() : List<String> {
        return joinedList
    }

    fun listBase2() : String {
        var maleNames = listOf("Luke","Enrico","Ali","Hamza")
        var femaleNames = mutableListOf("Lucy", "Jennifer", "Sumaya")
        var joinedList = maleNames union femaleNames
        return joinedList.random()
    }
}
