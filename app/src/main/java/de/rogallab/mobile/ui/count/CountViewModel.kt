package de.rogallab.mobile.ui.count

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CountViewModel: ViewModel() {

   // Define a MutableStateFlow with the initial CountUiState
   private val _countUiStateFlow: MutableStateFlow<CountUiState> =
      MutableStateFlow(CountUiState())  // factory method
   // Expose the MutableStateFlow as a read-only StateFlow to the UI
   val countUiStateFlow: StateFlow<CountUiState> =
      _countUiStateFlow.asStateFlow()        // convert to StateFlow

   // Increment the count value and update the CountUiState
   fun onIncrementCount() {
      // Update the MutableStateFlow
      _countUiStateFlow.update { countUiState ->
         // Increment the actual number
         val actual = countUiState.count.actual + 1
         // Create a copy the countUiState object
         countUiState.copy(count =
            // with a copy of the count object with the new actual value
            countUiState.count.copy(actual = actual) )
      }
   }
}