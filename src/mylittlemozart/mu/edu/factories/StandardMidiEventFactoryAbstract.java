package mylittlemozart.mu.edu.factories;

/**
 * Abstract factory that creates a StandardMidiEventFactory.
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    @Override
    public MidiEventFactory createFactory() {
        return new StandardMidiEventFactory();
    }
}
