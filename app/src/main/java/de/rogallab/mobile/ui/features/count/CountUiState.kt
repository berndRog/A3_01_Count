package de.rogallab.mobile.ui.features.count

import de.rogallab.mobile.domain.entities.Count

// immutable data class
data class CountUiState(
   // actual state
   val count: Count = Count(0)
)