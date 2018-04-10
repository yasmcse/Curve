package com.example.yasirnazir.curve.home.fragment

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.yasirnazir.curve.MyApp
import com.example.yasirnazir.curve.home.viewmodel.MainViewModel
import com.example.yasirnazir.curve.R
import com.example.yasirnazir.curve.databinding.FragmentInputLayoutBinding
import com.example.yasirnazir.curve.di.HomeViewModelFactory
import kotlinx.android.synthetic.main.fragment_input_layout.*
import javax.inject.Inject


class FragmentInputLayout : Fragment() {

    @Inject
    lateinit var mainViewModelFactory: HomeViewModelFactory

    var viewModel: MainViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.inflate<FragmentInputLayoutBinding>(inflater, R.layout.fragment_input_layout, container, false)
        (context?.applicationContext as MyApp).getAppComponentThis().inject(this)
        viewModel = ViewModelProviders.of(activity!!, mainViewModelFactory).get(MainViewModel::class.java)
        binding.model = viewModel
        return binding.root
    }


    private fun setupViews(inputField: EditText, inputFieldId: Int) {
        inputField.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                var tempField: String
                if (p0?.toString()!!.length == 0) {
                    tempField = "0.0"
                } else {
                    tempField = p0.toString()
                }
                viewModel?.updateField(resources.getResourceEntryName(inputFieldId), tempField.toDouble())

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

        })
    }

    fun observeSumField() {
        viewModel?.updateSumField?.observe(this, Observer { it ->
            sumField.setText(it.toString())
        })
    }

    fun onSumFieldTapped() {
        sumField.setOnClickListener() {
            flash()
        }
    }

    fun flash() {
        val handler = Handler()
        Thread(Runnable {
            val timeToBlink = 500    //in milissegunds
            try {
                Thread.sleep(timeToBlink.toLong())
            } catch (e: Exception) {
            }

            handler.post(Runnable {
                if (sumField?.visibility == View.VISIBLE) {
                    sumField?.visibility = View.INVISIBLE
                } else {
                    sumField?.visibility = View.VISIBLE
                }
                flash()
            })
        }).start()


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews(inputField1, R.id.inputField1)
        setupViews(inputField2, R.id.inputField2)
        setupViews(inputField3, R.id.inputField3)
        setupViews(inputField4, R.id.inputField4)
        setupViews(inputField5, R.id.inputField5)
        setupViews(inputField6, R.id.inputField6)
        observeSumField()
        onSumFieldTapped()
    }

    override fun onDetach() {
        super.onDetach()

    }

    companion object {
        fun createNewFragment(): FragmentInputLayout {
            return FragmentInputLayout()
        }

    }
}