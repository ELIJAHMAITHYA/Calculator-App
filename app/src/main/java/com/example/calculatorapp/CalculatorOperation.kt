package com.example.calculatorapp

sealed class CalculatorOperation(val symbol : String){
    object Add: CalculatorOperation("+")
    object Divide: CalculatorOperation("/")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")

}
