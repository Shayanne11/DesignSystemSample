package br.com.dsgirls

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.TypedValue
import androidx.appcompat.widget.AppCompatCheckBox

class CheckBoxGirls @JvmOverloads constructor(
    context: Context, attrs: AttributeSet?=null, defStyleAttr: Int = 0
): AppCompatCheckBox(context,attrs, defStyleAttr){

    init {
        //todas info que a gnt colocaria no xml colocamos aqui pq nao teremos xml aqui
        //definimos o padding left como 16, e deixamos os demais no padrao android
        setPadding(16,paddingTop,paddingRight,paddingBottom)
        setTextSize(TypedValue.COMPLEX_UNIT_PX,54F)
        isClickable = true
        attrs?.let {
            updateCheckBox(it)
        }

    }

    private fun updateCheckBox(attributeSet: AttributeSet) {
        val atributos: TypedArray = context.obtainStyledAttributes(
            attributeSet,
            R.styleable.CheckBoxDesign,
            0,
            0
        )


    }

}