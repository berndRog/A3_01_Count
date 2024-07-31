package de.rogallab.mobile.ui.compose1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.features.count.CountViewModel
import de.rogallab.mobile.domain.utils.logDebug
import de.rogallab.mobile.ui.compose2.ScreenContent
import de.rogallab.mobile.ui.features.count.CountUiState

@Composable
fun CountScreen4(
   viewModel: CountViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
) {

   // Collect the state, i.e convert the StateFlow to a State
   val countUiState: CountUiState by viewModel.countUiStateFlow.collectAsState()
   logDebug("[CountScreen4]", "Composition ${countUiState.count}")

   Column(
      modifier = Modifier
         .padding(all = 8.dp)
         .fillMaxSize(),
      verticalArrangement = Arrangement.Top
   ) {
      ScreenContent(
         count = countUiState.count.actual,         // State ↓
         onCountIncrement =                         // Event ↑
            viewModel::onIncrementCount

      )
   }
}
