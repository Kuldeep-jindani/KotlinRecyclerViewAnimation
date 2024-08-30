package com.kuldeep.kotlinrecyclerviewanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var linealLayoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        linealLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linealLayoutManager

        var models = ArrayList<RecyclerModel>()
        models.add(RecyclerModel(title = "Margherita", imgRes = R.drawable.pizza1))
        models.add(RecyclerModel(title = "Pepperoni ", imgRes = R.drawable.pizza2))
        models.add(RecyclerModel(title = "Neapolitan ", imgRes = R.drawable.pizza3))
        models.add(RecyclerModel(title = "BBQ chicken ", imgRes = R.drawable.pizza4))
        models.add(RecyclerModel(title = "Quattro formaggi ", imgRes = R.drawable.pizza5))
        models.add(RecyclerModel(title = "Mushrooms ", imgRes = R.drawable.pizza6))
        models.add(RecyclerModel(title = "Bacon", imgRes = R.drawable.smoothi))
        models.add(RecyclerModel(title = "Cheese Pizzas", imgRes = R.drawable.pizza1))
        models.add(RecyclerModel(title = "Meat Pizzas", imgRes = R.drawable.pizza2))
        models.add(RecyclerModel(title = "Vegetable Pizzas", imgRes = R.drawable.pizza3))
        models.add(RecyclerModel(title = "Deep Dish Pizzas", imgRes = R.drawable.pizza4))
        models.add(RecyclerModel(title = "Sicilian Pizza", imgRes = R.drawable.pizza5))
        models.add(RecyclerModel(title = "Neapolitan Pizza", imgRes = R.drawable.pizza6))
        models.add(RecyclerModel(title = "Meat Pizzas", imgRes = R.drawable.smoothi))
        models.add(RecyclerModel(title = "Cheese Pizzas", imgRes = R.drawable.pizza3))
        models.add(RecyclerModel(title = "Bacon", imgRes = R.drawable.pizza4))
        models.add(RecyclerModel(title = "Neapolitan", imgRes = R.drawable.pizza5))
        models.add(RecyclerModel(title = "BBQ chicken", imgRes = R.drawable.pizza6))

        adapter = RecyclerViewAdapter(models, this)
        recyclerView.adapter = adapter

    }
}