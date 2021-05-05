package com.akvelon.foodrecipes.ui.fragments.recipes.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akvelon.foodrecipes.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class RecipesBottomSheet : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.recipes_bottom_sheet, container, false)
    }
}