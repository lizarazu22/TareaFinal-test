package activities.clock;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class HoraSc {
    public Button okButton = new Button(By.id("com.google.android.deskclock:id/material_timepicker_ok_button"));
    public TextBox setNameTextBox = new TextBox(By.id("com.google.android.deskclock:id/label_input_field"));
    public Button okButtonNameAlarm = new Button(By.id("android:id/button1"));
}
