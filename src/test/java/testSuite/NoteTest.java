package testSuite;

import activities.notes.CrearNotaSc;
import activities.notes.PermisionScreen;
import activities.notes.PopUpScreen;
import activities.notes.MenuSc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class NoteTest {
    PermisionScreen permisionScreen = new PermisionScreen();
    PopUpScreen popUpScreen = new PopUpScreen();
    MenuSc menuSc = new MenuSc();
    CrearNotaSc crearNotaSc = new CrearNotaSc();
    String titleNote = "Testeo loco" + new Date().getTime();
    String bodyNote = "probando la notas" + new Date().getTime();
    @Test
    public void verifyAddNote() throws InterruptedException {
        permisionScreen.continueButton.click();
        popUpScreen.allowButton.click();
        popUpScreen.allowButton2.click();
        permisionScreen.continueButton2.click();
        popUpScreen.allowButton.click();
        menuSc.addNoteButton.click();
        crearNotaSc.titleNoteSet.click();
        crearNotaSc.titleNote.setText(titleNote);
        crearNotaSc.bodyNoteSet.click();
        crearNotaSc.bodyNote.setText(bodyNote);
        crearNotaSc.saveButton.click();
        Assertions.assertEquals(titleNote, menuSc.noteTitleCreated.getText(), "ERROR la nota no se creo correctamente!");
        Thread.sleep(3000);
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
