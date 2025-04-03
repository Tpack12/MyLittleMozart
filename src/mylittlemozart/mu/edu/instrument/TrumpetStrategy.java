package mylittlemozart.mu.edu.instrument;

public class TrumpetStrategy implements InstrumentStrategy {
    @Override
    public void applyInstrument(Track track, int channel) {
        //Set the instrument to Trumpet (MIDI instrument 56)
        track.setInstrument(56);
        System.out.println("Applying Trumpet (MIDI 56) to track on channel " + channel);
    }
}

