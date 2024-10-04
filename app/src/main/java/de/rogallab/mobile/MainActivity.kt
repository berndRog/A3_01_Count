package de.rogallab.mobile

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.count.composables.CountScreen1
import de.rogallab.mobile.ui.count.composables.Stateholder
import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {
   override fun onCreate(savedInstanceState: Bundle?) {

      super.onCreate(savedInstanceState)

      // Start Windows insets
      // https://developer.android.com/develop/ui/compose/layouts/insets
      enableEdgeToEdge()
      // use insets to show to snackbar above ime keyboard
      window?.let {  window ->
         WindowCompat.setDecorFitsSystemWindows(window, false)
      }

      setContent {
         logDebug(TAG,"setContent() Composition")

         AppTheme {
            Box(
               modifier = Modifier.safeDrawingPadding()
            ) {
               logDebug(TAG,"before CountScreen() Composition")
               // CountScreen2()
               Stateholder()
               // CountScreen4()

            }
         }
      }
   }

   companion object {
      private const val TAG = "<-MainActivity"
   }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//   Text(
//      text = "Hello $name!",
//      modifier = modifier
//   )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   AppTheme() {
      Surface(
         modifier = Modifier.fillMaxSize(),
         color = MaterialTheme.colorScheme.background
      ) {
         CountScreen1()
      }
   }
}
