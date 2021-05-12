package com.akvelon.foodrecipes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.navArgs
import com.akvelon.foodrecipes.R
import com.akvelon.foodrecipes.adapters.PagerAdapter
import com.akvelon.foodrecipes.ui.fragments.ingredients.IngredientsFragment
import com.akvelon.foodrecipes.ui.fragments.overview.OverviewFragment
import com.akvelon.foodrecipes.util.Constants.Companion.RECIPE_RESULT_KEY
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {

    private val args by navArgs<DetailsArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.white))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val fragments = ArrayList<Fragment>()
        fragments.add(OverviewFragment())
        fragments.add(IngredientsFragment())

        val titles = ArrayList<String>()
        titles.add("Overview")
        titles.add("Ingredients")

        val resultBundle = Bundle()
        resultBundle.putParcelable(RECIPE_RESULT_KEY, args.result)

        val adapter = PagerAdapter(
            resultBundle,
            fragments,
            titles,
            supportFragmentManager
        )

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}