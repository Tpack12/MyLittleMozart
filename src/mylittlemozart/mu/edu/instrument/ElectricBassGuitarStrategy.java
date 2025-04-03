package mylittlemozart.mu.edu.instrument;

public class ElectricBassGuitarStrategy implements InstrumentStrategy {
    @Override
    public void applyInstrument(Track track, int channel) {
        //Set the instrument to Electric Bass Guitar (MIDI instrument 33)
        track.setInstrument(33);
        System.out.println("Applying Electric Bass Guitar (MIDI 33) to track on channel " + channel);
    }
}
