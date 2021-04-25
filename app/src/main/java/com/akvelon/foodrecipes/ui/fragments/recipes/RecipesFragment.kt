package com.akvelon.foodrecipes.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akvelon.foodrecipes.R
import kotlinx.android.synthetic.main.fragment_recepies.view.*

class RecipesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recepies, container, false)

        view.recyclerview.showShimmer()

        return view
    }
}
