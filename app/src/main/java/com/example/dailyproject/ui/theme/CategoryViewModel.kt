package com.example.dailyproject.ui.theme

import androidx.lifecycle.ViewModel
import com.example.dailyproject.data.Category

class CategoryViewModel: ViewModel() {
    private val _category = mutableListOf<Category>(
        Category("Продукты"), Category("Транспорт"), Category("Развлечения")
    )

    val categories: List<Category>
        get() = _category

    fun addCategory(category: Category){
        _category.add(category)
    }

    fun delCategory(category: Category){
        _category.remove(category)
    }}