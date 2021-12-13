package com.example.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.DataNews
import com.example.newsapp.NewsAdapter


class AllNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)
        val rvNews = view.findViewById<RecyclerView>(R.id.tv_all_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listAllNews)

        return  view
    }
}


