package com.flask.colorpicker.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;

public class SampleActivity2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample2);

		ColorPickerView colorPickerView = (ColorPickerView) findViewById(R.id.color_picker_view);
		colorPickerView.addOnColorSelectedListener(new OnColorSelectedListener() {
			@Override
			public void onColorSelected(int selectedColor) {
				Toast.makeText(
						SampleActivity2.this,
						"selectedColor: " + Integer.toHexString(selectedColor).toUpperCase(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}

}