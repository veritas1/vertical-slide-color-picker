# Vertical Slide Color Picker

![Demo gif](https://drive.google.com/uc?export=download&id=0B4_9eDf8wHFJNEZWWXlzQmdtZnM)

## Example usage

layout.xml
```	
<com.github.veritas1.verticalslidecolorpicker.VerticalSlideColorPicker
		android:id="@+id/color_picker"
		android:layout_width="30dp"
		android:layout_height="100dp"
		colorpicker:borderColor="@android:color/black"
		colorpicker:borderWidth="2dp"
		colorpicker:colors="@array/my_color_array"/>
```

Activity.java
```
final VerticalSlideColorPicker colorPicker = (VerticalSlideColorPicker) findViewById(R.id.color_picker);
final View selectedColorView = findViewById(R.id.selected_color);

colorPicker.setOnColorChangeListener(new VerticalSlideColorPicker.OnColorChangeListener() {
	@Override
	public void onColorChange(int selectedColor) {
		selectedColorView.setBackgroundColor(selectedColor);
	}
});
```
## Add to project
Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
```
dependencies {
	compile 'com.github.veritas1:verticalslidecolorpicker:$VERSION' // Check revision history
	// OR
	compile 'com.github.veritas1:verticalslidecolorpicker:master-SNAPSHOT'
}
```
## Revision History
* 1.0.0 - Initial release
