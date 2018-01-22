package ayatmaulana.com.icirebon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler;
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(  this, "Welcome !", Toast.LENGTH_SHORT ).show()

    }
}
