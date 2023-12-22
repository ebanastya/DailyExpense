package com.example.dailyproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dailyproject.Screen.AddCategoryScreen
import com.example.dailyproject.Screen.AddExpenseScreen
import com.example.dailyproject.Screen.ExpStatisticScreen
import com.example.dailyproject.Screen.ExpenseScreen
import com.example.dailyproject.ui.theme.CategoryViewModel
import com.example.dailyproject.ui.theme.DailyProjectTheme
import com.example.dailyproject.ui.theme.ExpenseViewModel

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val expenseViewModel = viewModel<ExpenseViewModel>()
            val categoryViewModel = viewModel<CategoryViewModel>()
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "/expenses"){
                composable("/expenses"){
                    ExpenseScreen(expenseViewModel, navController)
                }
                composable("/add-expense"){
                    AddExpenseScreen(expenseViewModel,categoryViewModel,navController)
                }
                composable("/add-category"){
                    AddCategoryScreen(categoryViewModel,navController)
                }
                composable("/statistic"){
                    ExpStatisticScreen(categoryViewModel,expenseViewModel, navController)
                }
            }
        }
    }
}