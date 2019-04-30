package com.example.myapplication

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.R
import androidx.appcompat.widget.AppCompatEditText
import com.airbnb.epoxy.ModelView

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT, saveViewState = true)
class CustomEditTextEpoxy @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = R.attr.editTextStyle
) : AppCompatEditText(context, attrs, defStyleAttr) {
    override fun onSaveInstanceState(): Parcelable? {
        Log.d("STATE", "CustomEditTextEpoxy.onSaveInstanceState")
        return super.onSaveInstanceState()
    }
}