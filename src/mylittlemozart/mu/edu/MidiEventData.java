package mylittlemozart.mu.edu;

import javax.sound.midi.ShortMessage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Represents a single MIDI event parsed from the CSV input file.
// Includes note on/off type, tick, pitch, velocity, channel, and instrument info.

public class MidiEventData {
	private int startEndTick;
    private int velocity;
    private int note;
    private int channel;
    private int instrument;
    private int noteOnOff;
    
    
// Constructs a new MidiEventData object.
// @param startEndTick The tick when the event occurs
// @param velocity     The note's velocity (0 for note off)
// @param note         The pitch (MIDI note number)
// @param channel      The MIDI channel
// @param instrument   The instrument assigned
// @param noteOnOff    Indicates if this is a Note On or Note Off event

    public MidiEventData(int startEndTick, int velocity, int note,
                         int channel, int instrument, int noteOnOff) {
        this.startEndTick = startEndTick;
        this.velocity = velocity;
        this.note = note;
        this.channel = channel;
        this.instrument = instrument;
        this.noteOnOff = noteOnOff;
    }

    public int getStartEndTick() {
        return startEndTick;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getNote() {
        return note;
    }

    public int getChannel() {
        return channel;
    }

    public int getInstrument() {
        return instrument;
    }

    public int getNoteOnOff() {
        return noteOnOff;
    }
}
