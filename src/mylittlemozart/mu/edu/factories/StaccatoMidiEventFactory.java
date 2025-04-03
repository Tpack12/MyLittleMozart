package mylittlemozart.mu.edu.factories;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

/**
 * Staccato style factory: generates NoteOff events that shorten
 * note duration by 120 ticks to create a detached effect.
 */
public class StaccatoMidiEventFactory extends StandardMidiEventFactory {

    /**
     * Creates a NoteOff event with shortened duration (-120 ticks).
     *
     * @param tick    original end tick
     * @param note    pitch
     * @param channel MIDI channel
     * @return MidiEvent with early NoteOff
     * @throws InvalidMidiDataException if MIDI data is invalid
     */
    @Override
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        return super.createNoteOff(tick - 120, note, channel);
    }
}
