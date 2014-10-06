package com.example.indicedemasacorporal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private IndiceMasaCorporal imc;
	EditText editPeso;
	EditText editAltura;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Establecer identificadores
		editPeso = (EditText) findViewById(R.id.editPeso);
		editAltura = (EditText) findViewById(R.id.editAltura);

	}

	/**
	 * onButtonClickCalcularIMC
	 */
	public void onButtonClickCalcularIMC(View v) {

		try {
			Double peso = Double.valueOf(editPeso.getText().toString());
			Integer altura = Integer.valueOf(editAltura.getText().toString());

			imc = new IndiceMasaCorporal(peso, altura);
			Log.d("IMC", imc.toString());
			Log.d("IMC", String.valueOf(imc.valorIndiceMasaCorporal()));
		} catch (Exception e) {
			Log.e("IMC_ERROR", e.getMessage());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
