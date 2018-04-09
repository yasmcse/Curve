package com.example.yasirnazir.curve.home.viewmodel

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.never
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.verify


class MainViewModelTest {


    lateinit var liveData: MutableLiveData<Double>
    lateinit var model: MainViewModel

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    @Before
    fun before() {
        liveData = MutableLiveData<Double>()
        model = MainViewModel()
    }


    @Test
    fun observeSumAfterUpdateField1() {
        //given
        val returnedItem = 5.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }

    @Test
    fun observeSumAfterUpdateField1AndField2() {
        //given
        val returnedItem = 10.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        model.updateField("inputField2", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }

    @Test
    fun observeSumAfterUpdateField1AndField2AndField3() {
        //given
        val returnedItem = 15.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        model.updateField("inputField2", 5.0)
        model.updateField("inputField3", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }


    @Test
    fun observeSumAfterUpdateField1AndField2AndField3AndField4() {
        //given
        val returnedItem = 20.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        model.updateField("inputField2", 5.0)
        model.updateField("inputField3", 5.0)
        model.updateField("inputField4", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }

    @Test
    fun observeSumAfterUpdateField1AndField2AndField3AndField4AndField5() {
        //given
        val returnedItem = 25.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        model.updateField("inputField2", 5.0)
        model.updateField("inputField3", 5.0)
        model.updateField("inputField4", 5.0)
        model.updateField("inputField5", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }

    @Test
    fun observeSumAfterUpdateField1AndField2AndField3AndField4AndField5AndField6() {
        //given
        val returnedItem = 30.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        model.updateField("inputField1", 5.0)
        model.updateField("inputField2", 5.0)
        model.updateField("inputField3", 5.0)
        model.updateField("inputField4", 5.0)
        model.updateField("inputField5", 5.0)
        model.updateField("inputField6", 5.0)
        liveData.value = returnedItem

        //than
        verify(observer).onChanged(returnedItem)
    }

    @Test
    fun observeSumWhenNothingIsEnteredInAnyInputField() {
        //given
        val returnedItem = 0.0
        val observer = mock<Observer<Double>>()
        model.updateSumField.observeForever(observer)

        //when
        liveData.value = returnedItem

        //than
        verify(observer, never()).onChanged(returnedItem)
    }

}