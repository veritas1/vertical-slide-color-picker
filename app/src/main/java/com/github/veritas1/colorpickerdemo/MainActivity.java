package com.github.veritas1.colorpickerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.github.veritas1.verticalslidecolorpicker.VerticalSlideColorPicker;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final VerticalSlideColorPicker colorPicker = (VerticalSlideColorPicker) findViewById(R.id.color_picker);
		final View selectedColorView = findViewById(R.id.selected_color);

		colorPicker.setOnColorChangeListener(new VerticalSlideColorPicker.OnColorChangeListener() {
			@Override
			public void onColorChange(int selectedColor) {
				selectedColorView.setBackgroundColor(selectedColor);
			}
		});
	}
}
