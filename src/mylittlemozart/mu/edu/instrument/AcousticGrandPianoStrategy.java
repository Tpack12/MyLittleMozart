package mylittlemozart.mu.edu.instrument;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
    @Override
    public void applyInstrument(Track track, int channel) {
        //Set the instrument to Acoustic Grand Piano (MIDI instrument 0)
        track.setInstrument(0);
        System.out.println("Applying Acoustic Grand Piano (MIDI 0) to track on channel " + channel);
    }
}

