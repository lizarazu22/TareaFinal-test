package activities.clock;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class AlarmaSc {
    public Button addAlarmButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label nameAlarmLabel = new Label(By.id("com.google.android.deskclock:id/edit_label"));

}
