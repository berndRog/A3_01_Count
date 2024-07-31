package de.rogallab.mobile.ui.compose1

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utils.logDebug

@Composable
fun CountScreen1() {

   val countState: MutableState<Int> = remember { mutableIntStateOf(0) }

   Column(
      modifier = Modifier.padding(all = 8.dp).fillMaxSize(),
      verticalArrangement = Arrangement.Top
   ) {

      logDebug("[CountScreen]", "Composition ${countState.value}")

      Text(
         text = countState.value.toString(),  // state
         textAlign = TextAlign.Center,
         modifier = Modifier.padding(vertical = 8.dp)
            .border(border = BorderStroke(3.dp, Color.Gray))
            .padding(vertical = 8.dp).fillMaxWidth()
      )

      Button(
         onClick = { countState.value++ },  // setter
         modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth()
      ) {
         Text ( text = "Hochzählen" )
      }
   }
}

