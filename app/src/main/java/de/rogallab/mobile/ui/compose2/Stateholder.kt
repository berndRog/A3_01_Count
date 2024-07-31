package de.rogallab.mobile.ui.compose2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import de.rogallab.mobile.domain.utils.logDebug

@Composable
fun Stateholder() {
   // State
   var count: Int by rememberSaveable { mutableIntStateOf(0) }
   // Change State ( App Logic )
   fun onCountIncrement() {
      count += 1
   }

   logDebug("[Stateholder]", "Composition $count")

   // call the composable
   CountScreen3(
      count = count,                            // State ↓
      onCountIncrement = { onCountIncrement() } // Event ↑
   )

}