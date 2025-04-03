package mylittlemozart.mu.edu.factories;

// Abstract factory for creating a LegatoMidiEventFactory.

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    /**
     * Returns an instance of LegatoMidiEventFactory.
     *
     * @return a new LegatoMidiEventFactory
     */
    @Override
    public MidiEventFactory createFactory() {
        return new LegatoMidiEventFactory();
    }
}
