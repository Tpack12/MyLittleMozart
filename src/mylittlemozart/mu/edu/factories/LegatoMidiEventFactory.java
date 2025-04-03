package mylittlemozart.mu.edu.factories;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

/**
 * Legato style factory: generates NoteOff events that extend
 * note duration by 80 ticks for smoother, connected sound.
 */
public class LegatoMidiEventFactory extends StandardMidiEventFactory implements MidiEventFactory {

    @Override
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        return super.createNoteOff(tick + 80, note, channel);
    }
}
