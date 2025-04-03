package mylittlemozart.mu.edu.factories;

public abstract class MidiEventFactory {
    public abstract MidiEvent createMidiEvent(int startTick, int note, int velocity, int duration);
}

