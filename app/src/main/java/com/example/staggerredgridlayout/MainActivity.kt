package com.example.staggerredgridlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.staggerredgridlayout.Adapter.Item_Adapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemlist:ArrayList<Int>
    private lateinit var itemAdapter: Item_Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
    }
    private fun init(){
        itemlist=ArrayList()
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        addList()
        itemAdapter = Item_Adapter(itemlist)
        recyclerView.adapter=itemAdapter
    }
    private fun addList(){

        itemlist.add(R.drawable.myhero)
        itemlist.add(R.drawable.slide2)
        itemlist.add(R.drawable.myhero)
        itemlist.add(R.drawable.slide2)
        itemlist.add(R.drawable.myhero)
        itemlist.add(R.drawable.slide2)
        itemlist.add(R.drawable.myhero)
        itemlist.add(R.drawable.slide2)
        itemlist.add(R.drawable.myhero)
        itemlist.add(R.drawable.slide2)

    }
}