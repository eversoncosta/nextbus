package pacote.NextBus10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TempoChegada2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_tempo_chegada2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tempo_chegada2, menu);
		return true;
	}

}
