package com.example.yasirnazir.curve.home.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
 class MainViewModel : ViewModel() {
    var field1: Double = 0.0
    var field2: Double = 0.0
    var field3: Double = 0.0
    var field4: Double = 0.0
    var field5: Double = 0.0
    var field6: Double = 0.0
    var sum: Double = 0.0
    val updateSumField: MutableLiveData<Double> = MutableLiveData()


    fun updateField(fieldName: String, fieldValue: Double) {
        when (fieldName) {
            inputField1 -> {

                this.field1 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)

            }
            inputField2 -> {
                this.field2 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)
            }
            inputField3 -> {
                this.field3 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)
            }
            inputField4 -> {
                this.field4 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)
            }
            inputField5 -> {
                this.field5 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)
            }
            inputField6 -> {
                this.field6 = fieldValue
                sum = field1.plus(field2).plus(field3).plus(field4).plus(field5).plus(field6)
                updateSumField.postValue(sum)
            }

            else -> println("Unknown field name")
        }

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

