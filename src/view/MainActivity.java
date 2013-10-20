package view;

import com.example.drawfree.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void changeColor(View view){
				TypedValue colour = null;
				Resources res = getResources();
				res.getValue(view.getTag().toString(), colour, true);
	}

}
