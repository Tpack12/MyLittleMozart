package mylittlemozart.mu.edu.factories;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

// Legato style factory: generates NoteOff events that extend
// note duration by 80 ticks for smoother, connected sound.

public class LegatoMidiEventFactory extends StandardMidiEventFactory{

	/**
     * Creates a NoteOff event with extended duration (+80 ticks).
     *
     * @param tick    original end tick
     * @param note    pitch
     * @param channel MIDI channel
     * @return MidiEvent with delayed NoteOff
     * @throws InvalidMidiDataException if MIDI data is invalid
     */
    @Override
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        return super.createNoteOff(tick + 80, note, channel);
    }
}
