package io.programming4food.meanmachine.fragments


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import io.programming4food.meanmachine.R
import android.widget.TextView
import android.widget.EditText
import java.nio.file.Files.delete
import android.text.Editable
import android.support.annotation.IdRes
import io.programming4food.meanmachine.QRActivity
import org.jetbrains.anko.support.v4.toast
import java.lang.Integer.parseInt

/**
 * A simple [Fragment] subclass.
 *
 */

class FixedAmountTabFragment : Fragment(), View.OnClickListener {
    private var mPasswordField: EditText? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_fixed_amount_tab, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view:View) {
        mPasswordField = view.findViewById<EditText>(R.id.fixed_amount_txt)
        
        view.findViewById<TextView>(R.id.t9_key_0).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_1).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_2).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_3).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_4).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_5).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_6).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_7).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_8).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_9).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_clear).setOnClickListener(this)
        view.findViewById<TextView>(R.id.t9_key_backspace).setOnClickListener(this)
        view.findViewById<TextView>(R.id.bill_button).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.tag != null && "number_button" == v!!.tag) {
            mPasswordField!!.append((v as TextView).text)
            return
        }

        when (v!!.getId()) {
            R.id.t9_key_clear -> { // handle clear button
                mPasswordField!!.setText(null)
            }
            R.id.t9_key_backspace -> { // handle backspace button
                // delete one character
                val editable = mPasswordField!!.text
                val charCount = editable.length
                if (charCount > 0) {
                    editable.delete(charCount - 1, charCount)
                }
            }
            R.id.bill_button -> {
                val editable = mPasswordField!!.text
                val charCount = editable.length

                if(mPasswordField!!.text.toString() == "") {
                    toast("Debes ingresar un importe de mínimo $1 MXN")
                }

                if(mPasswordField!!.text.toString() != "" && Integer.parseInt(mPasswordField!!.text.toString()) > 0) {
                    val i = Intent(context, QRActivity::class.java)
                    i.putExtra("amount", mPasswordField!!.text.toString())
                    startActivity(i)
                } else {
                    toast("Por favor ingresa un valor")
                }
            }
        }
    }

    fun getInputText(): String {
        return mPasswordField!!.getText().toString()
    }

}
