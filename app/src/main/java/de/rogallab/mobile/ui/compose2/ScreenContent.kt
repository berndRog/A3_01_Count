package de.rogallab.mobile.ui.compose2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utils.logDebug

@Composable
fun ScreenContent(
   count: Int,                   // State ↓
   onCountIncrement: () -> Unit  // Event ↑
) {

   logDebug("[ScreenContent]", "Composition $count")

   Text(
      text = count.toString(),  // state
      textAlign = TextAlign.Center,
      modifier = Modifier
         .padding(vertical = 8.dp)
         .border(border = BorderStroke(3.dp, Color.Gray))
         .padding(vertical = 8.dp)
         .fillMaxWidth()
   )

   Button(
      onClick = {
         logDebug("[ScreenContent]", "Button clicked")
         onCountIncrement()
      },
      modifier = Modifier
         .padding(vertical = 8.dp)
         .fillMaxWidth()
   ) {
      Text(
         text = "Hochzählen"
      )
   }
}


