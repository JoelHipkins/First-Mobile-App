package edu.vt.cs5254.geoquiz

class Question {
}

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)