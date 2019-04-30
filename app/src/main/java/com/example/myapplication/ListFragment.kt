package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyRecyclerView

class ListFragment : Fragment() {
    private val controller = ListController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("STATE", "ListFragment.onCreate")
//        controller.onRestoreInstanceState(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val epoxy = view.findViewById<EpoxyRecyclerView>(R.id.recycler_view)

        epoxy.setController(controller)
        epoxy.requestModelBuild()
    }

    class ListController : EpoxyController() {
        override fun buildModels() {
            (0 until 1).forEach {
                customEditText {
                    id(it)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("STATE", "ListFragment.onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("STATE", "ListFragment.onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("STATE", "ListFragment.onSaveInstanceState")
//        controller.onSaveInstanceState(outState)
    }
}

