package sjniit.sj.notessj.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import sjniit.sj.notessj.dao.NoteDao;
import sjniit.sj.notessj.entities.Note;

@Database(entities = Note.class, version=1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {
    private static  NoteDatabase noteDatabase;

    public static synchronized NoteDatabase getDataBase(Context context) {
        if (noteDatabase == null) {
            noteDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                    "notes_db"
            ).build();
        }
        return noteDatabase;
    }

    public abstract NoteDao noteDao();
}
