package activities.whendo;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {
    public TextBox titleTextBox = new TextBox(By.xpath("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTextBox = new TextBox(By.xpath("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.xpath("com.vrproductiveapps.whendo:id/saveItem"));
}
