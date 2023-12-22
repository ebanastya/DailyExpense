package com.example.dailyproject.ui.theme

import androidx.lifecycle.ViewModel
import com.example.dailyproject.data.Expence

class ExpenseViewModel: ViewModel() {
    private val _expense = mutableListOf<Expence>()
    val expenses: List<Expence>
        get() = _expense

    fun addExpence(expence: Expence){
        _expense.add(expence)
    }

    fun delExpence(expence: Expence){
        _expense.remove(expence)
    }
}