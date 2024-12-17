package com.github.enxy0.coordinatorlayoutinsets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.UUID

class HomeFragment : Fragment() {

    private lateinit var coordinatorRootView: CoordinatorLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var appBarLayout: AppBarLayout
    private lateinit var fab: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        setWindowInsets()
    }

    private fun initViews(view: View) {
        coordinatorRootView = view.findViewById(R.id.coordinatorRoot)
        recyclerView = view.findViewById(R.id.recyclerView)
        appBarLayout = view.findViewById(R.id.appBarLayout)
        fab = view.findViewById(R.id.fab)
        recyclerView.adapter = TestAdapter().apply {
            submitList(generateSequence { UUID.randomUUID().toString() }.take(100).toList())
        }
    }

    private fun setWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(appBarLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            appBarLayout.updatePadding(systemBars.left, systemBars.top, systemBars.right, 0)
            WindowInsetsCompat.CONSUMED
        }
        ViewCompat.setOnApplyWindowInsetsListener(recyclerView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.updatePadding(systemBars.left, 0, systemBars.right, systemBars.bottom)
            WindowInsetsCompat.CONSUMED
        }
        val fabMarginLeft = fab.marginLeft
        val fabMarginTop = fab.marginTop
        val fabMarginRight = fab.marginRight
        val fabMarginBottom = fab.marginBottom
        ViewCompat.setOnApplyWindowInsetsListener(fab) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                setMargins(
                    systemBars.left + fabMarginLeft,
                    fabMarginTop,
                    systemBars.right + fabMarginRight,
                    systemBars.bottom + fabMarginBottom
                )
            }
            WindowInsetsCompat.CONSUMED
        }
    }
}
