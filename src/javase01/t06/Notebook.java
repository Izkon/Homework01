package javase01.t06;

/**
 * Created by Izkon on 01.05.2017.
 */
public class Notebook {

    NoteInNotebook[] notes = new NoteInNotebook[100];
    int lastNoteID = -1;

     /**
     * Function for adding notes to notebook object
     * @param note
     */
    public void addNote(NoteInNotebook note) {    //adding notes to notebook
        if (lastNoteID < notes.length) {
            notes[lastNoteID + 1] = note;
            lastNoteID = lastNoteID + 1;
        } else
            System.out.println("Notebook is full, please remove some notes.");
    }
     /**
     * Function for removing notes from notebook object
     * @param id
     */
    public void deleteNote (int id) {    //removing notes from notebook
        if (id >=0 & id<= notes.length) {
            for (int i=id; i < lastNoteID; i++) {
                notes [i] = notes [i + 1];
            }
            lastNoteID = lastNoteID - 1;
        } else
            System.out.println("Note is not exist in Notebook.");
    }
     /**
     * Function for returning notes from notebook object
     * @param id
     */
    public NoteInNotebook getNote(int id) {               //returning notes from notebook
        if (id >=0 & id <= notes.length) {
            return notes[id];
        } else
            return null;
    }

     /**
     * Function for editing notes in notebook object
     * @param id
     * @param note
     */
    public void editNote (int id, NoteInNotebook note) {    //editing notes in notebook
        if (id >= 0 & id <= notes.length) {
            notes [id] = note;
        } else
            System.out.println("Note is not exist in Notebook.");

    }
     /**
     * Function for showing all notes in notebook object
     */
    public NoteInNotebook[] getAllNotes () {                  //showing all notes in notebook
        NoteInNotebook [] notesNew = new NoteInNotebook [lastNoteID+1];
        for (int i = 0; i <= lastNoteID; i++) {
            notesNew [i] = notes [i];
        }
        return notesNew;

    }

}
