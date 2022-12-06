package com.alg.meta.plugin.metaframe.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

/**
 * @Author laoyuyu
 * @Description
 * @Date 5:04 PM 2022/12/6
 **/
abstract class BaseFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return setComposeView()
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initData(savedInstanceState)
  }

  abstract fun initData(savedInstanceState: Bundle?)
  abstract fun setComposeView(): ComposeView
}