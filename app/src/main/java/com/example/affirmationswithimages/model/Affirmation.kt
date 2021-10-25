package com.example.affirmationswithimages.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringDef
import androidx.annotation.StringRes

class Affirmation(@StringRes val stringResourceId : Int, @DrawableRes val imageResourceId : Int)