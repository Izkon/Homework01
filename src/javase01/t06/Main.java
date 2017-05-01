package javase01.t06;

import java.util.Date;
/**
 * Created by Izkon on 01.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        Notebook personalNotebook = new Notebook ();

        personalNotebook.addNote(new NoteInNotebook(new Date(), "First note."));
        personalNotebook.addNote(new NoteInNotebook(new Date(), "Second note."));
        personalNotebook.addNote(new NoteInNotebook(new Date(), "Third note."));

        NoteInNotebook[] allNotes = personalNotebook.getAllNotes();

        for (int i = 0; i < allNotes.length; i++) {
            System.out.println (allNotes[i].note + " " + allNotes[i].date);

        }

        System.out.println();

    }

}
