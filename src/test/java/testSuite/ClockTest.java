package testSuite;

import activities.clock.HoraSc;
import activities.clock.AlarmaSc;
import activities.clock.MenuSc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ClockTest {
    HoraSc HoraSc = new HoraSc();
    AlarmaSc alarmaSc = new AlarmaSc();
    MenuSc menuSc = new MenuSc();

    @Test
    public void verifyCreateNewAlarm(){
        String nameAlarm= "despertador";
        menuSc.alarmButton.click();
        alarmaSc.addAlarmButton.click();
        HoraSc.okButton.click();
        alarmaSc.nameAlarmLabel.click();
        HoraSc.setNameTextBox.setText(nameAlarm);
        HoraSc.okButtonNameAlarm.click();
        String actualResult= alarmaSc.nameAlarmLabel.getText();
        Assertions.assertEquals(nameAlarm,actualResult,"ERROR La alarma no pudo ser creada");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
