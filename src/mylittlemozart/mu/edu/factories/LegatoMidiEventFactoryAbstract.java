package mylittlemozart.mu.edu.factories;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    @Override
    public MidiEventFactory createFactory() {
        return new LegatoMidiEventFactory();
    }
}
