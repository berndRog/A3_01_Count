package de.rogallab.mobile.ui.count.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utilities.logDebug

@Composable
fun CountScreen3(
   count: Int,                   // State ↓
   onCountIncrement: () -> Unit  // Event ↑
) {

   Column(
      modifier = Modifier
         .padding(all = 8.dp)
         .fillMaxSize(),
      verticalArrangement = Arrangement.Top
   ) {
      logDebug("<-CountScreen3", "Composition $count")
      ScreenContent(
         count = count,                          // State ↓
         onCountIncrement = { onCountIncrement() } // Event ↑
      )
   }
}