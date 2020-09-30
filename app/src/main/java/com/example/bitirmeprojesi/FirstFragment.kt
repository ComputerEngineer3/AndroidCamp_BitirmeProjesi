package com.example.bitirmeprojesi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.launch

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val destination = FirstFragmentDirections.actionFirstFragmentToSecondFragment2()
        //findNavController().navigate(destination)



        lifecycleScope.launch {
            val response = RetrofitProvider.newsApi.getData()

            recyclerView.adapter = DataAdapter(response.orEmpty().toMutableList()) {
                val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment2(it)
                findNavController().navigate(direction)
            }

        }



    }
}