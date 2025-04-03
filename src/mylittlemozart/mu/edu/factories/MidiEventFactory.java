package mylittlemozart.mu.edu.factories;

<<<<<<< HEAD
public abstract class MidiEventFactory {
    public abstract MidiEvent createMidiEvent(int startTick, int note, int velocity, int duration);
=======
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

/**
 * Interface for creating MIDI note-on and note-off events.
 */
public interface MidiEventFactory {

    /**
     * Creates a MIDI Note On event.
     *
     * @param tick     The time in ticks when the note starts
     * @param note     The pitch value
     * @param velocity The velocity (volume)
     * @param channel  The MIDI channel
     * @return MidiEvent representing the Note On
     * @throws InvalidMidiDataException if MIDI data is invalid
     */
    MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;

    /**
     * Creates a MIDI Note Off event.
     *
     * @param tick    The time in ticks when the note ends
     * @param note    The pitch value
     * @param channel The MIDI channel
     * @return MidiEvent representing the Note Off
     * @throws InvalidMidiDataException if MIDI data is invalid
     */
    MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
>>>>>>> b412fa3ca762df080e3012359e9bda4d0f5c7d67
}

