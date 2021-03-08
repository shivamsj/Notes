package sjniit.sj.notessj.listeners;

import sjniit.sj.notessj.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note , int position);

}
