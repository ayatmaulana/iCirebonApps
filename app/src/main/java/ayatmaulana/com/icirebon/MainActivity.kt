package ayatmaulana.com.icirebon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun aboutClicked(v: View?) {

        val intent = Intent(this, DetailOneActivity::class.java)

        startActivity( intent )
    }
}
