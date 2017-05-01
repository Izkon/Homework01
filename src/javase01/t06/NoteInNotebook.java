package javase01.t06;

import java.util.Date;
/**
 * Created by Izkon on 01.05.2017.
 */
/**
 * Class for notes with dates in notebook object
 */
public class NoteInNotebook {
    public String note;
    public Date date;

    public NoteInNotebook (Date _date, String _note) {
        note = _note;
        date = _date;
    }
}
