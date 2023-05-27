package com.utotech.danzhehplus.fragments

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utotech.danzhehplus.R
import com.utotech.danzhehplus.adapters.CoursesPagerAdapter
import com.utotech.danzhehplus.databinding.FragmentCoursesBinding
import com.utotech.danzhehplus.model.Course


class CoursesFragment : Fragment() {

    lateinit var binding: FragmentCoursesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCoursesBinding.inflate(layoutInflater, container, false)

        binding.pager.adapter = CoursesPagerAdapter(getCourses(),context)
        return binding.root
    }



    fun getCourses(): ArrayList<Course> {
        val list = ArrayList<Course>()
        list.add(
            Course(
                "Super Minds",
                "     Super Minds is a Primary course for schools with 5 or more weekly English lessons.\n" +
                        "It offers 7 levels,with the possibility to use the Starter level in the last year of Infantil. ",
                "Herbert Puchta, Günter Gerngross\n",
                7,
                "A1-B1(Complete Beginner to Preintermediate)",
                R.drawable.sp
            )
        )
        list.add(
            Course(
                "Family & Friends",
                "     Family & Friends is a Primary course for schools with 4 or more weekly English lessons.\n" +
                        "It offers 6 levels,with the possibility to use the Starter level in the last year of Infantil. ",
                "Herbert Puchta, Günter Gerngross\n",
                7,
                "A1-B1(Complete Beginner to Preintermediate)",
                        R.drawable.families
            )
        )
        list.add(
            Course(
                "Oxford Phonics world",
                "     Phonics is a Primary course for schools with 5 or more weekly English lessons.\n" +
                        "It offers 5 levels,with the possibility to use the Starter level in the last year of Infantil. ",
                "Herbert Puchta, Günter Gerngross\n",
                5,
                "starter", R.drawable.phonics
            )
        )
        list.add(
            Course(
                "Headway",
                "     Headway is a Primary course for schools with 5 or more weekly English lessons.\n" +
                        "It offers 5 levels,with the possibility to use the Starter level in the last year of Infantil.  ",
                "Herbert Puchta, Günter Gerngross\n",
                6,
                "A1-C1(Complete Beginner to Advance)",
                R.drawable.headways
            )
        )

        return list
    }
}



