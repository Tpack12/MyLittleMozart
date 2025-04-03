package mylittlemozart.mu.edu.factories;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

/**
 * Interface for creating MIDI note-on and note-off events.
 */
public interface MidiEventFactory {

    MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;

    MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}


