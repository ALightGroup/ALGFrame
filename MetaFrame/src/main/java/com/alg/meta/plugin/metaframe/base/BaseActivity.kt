package com.alg.meta.plugin.metaframe.base

import android.os.Bundle
import androidx.activity.ComponentActivity

abstract class BaseActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    initData(savedInstanceState)
  }

  abstract fun initData(savedInstanceState: Bundle?)

}
