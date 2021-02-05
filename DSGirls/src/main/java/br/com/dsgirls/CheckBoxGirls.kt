package br.com.dsgirls

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.TypedValue
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.content.ContextCompat

enum class CheckTypes{
    PURPLE,
    BLUE
}


class CheckBoxGirls @JvmOverloads constructor(
    context: Context, attrs: AttributeSet?=null, defStyleAttr: Int = 0
): AppCompatCheckBox(context,attrs, defStyleAttr){

    private lateinit var checkBoxTypes: CheckTypes

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
        val enumCheckBoxIndex = atributos.getInt(R.styleable.CheckBoxDesign_checkBoxTypes,0)
        checkBoxTypes = CheckTypes.values()[enumCheckBoxIndex]
        atributos.recycle() // Reutiliza as informacoes, para nao construir e desconstruir  toda vez que chamamos a funcao
        updateCheckBoxColor(checkBoxTypes)


    }
    private fun updateCheckBoxColor(banana: CheckTypes){
        when(banana){
            CheckTypes.BLUE -> {
                setButtonDrawable(R.drawable.checkbox_blue)
                setTextColor(ContextCompat.getColor(context,R.color.color_blue))

            }
            CheckTypes.PURPLE -> {
                setButtonDrawable(R.drawable.checkbox_violet)
                setTextColor(ContextCompat.getColor(context,R.color.color_violet))

            }
        }
    }

}