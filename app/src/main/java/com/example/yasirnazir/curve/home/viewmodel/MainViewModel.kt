package com.example.yasirnazir.curve.home.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.yasirnazir.curve.models.Input

class MainViewModel : ViewModel() {

    val input = Input()
    val updateSumField: MutableLiveData<Double> = MutableLiveData()

    fun updateField(fieldName: String, fieldValue: Double) {
        when (fieldName) {
            inputField1 -> {

                input.field1 = fieldValue
                computeSum()

            }
            inputField2 -> {
                input.field2 = fieldValue
                computeSum()
            }
            inputField3 -> {
                input.field3 = fieldValue
                computeSum()
            }
            inputField4 -> {
                input.field4 = fieldValue
                computeSum()

            }
            inputField5 -> {
                input.field5 = fieldValue
                computeSum()
            }
            inputField6 -> {
                input.field6 = fieldValue
                computeSum()
            }

            else -> println("Unknown field name")
        }

    }

    private fun computeSum() {
        input.sum = input.field1.plus(input.field2).plus(input.field3).plus(input.field4).plus(input.field5).plus(input.field6)
        updateSumField.postValue(input.sum)
    }


    companion object {
        const val inputField1 = "inputField1"
        const val inputField2 = "inputField2"
        const val inputField3 = "inputField3"
        const val inputField4 = "inputField4"
        const val inputField5 = "inputField5"
        const val inputField6 = "inputField6"
    }
}

