package mylittlemozart.mu.edu.factories;

/**
 * Abstract factory for creating a StaccatoMidiEventFactory.
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

    /**
     * Returns an instance of StaccatoMidiEventFactory.
     *
     * @return a new StaccatoMidiEventFactory
     */
    @Override
    public MidiEventFactory createFactory() {
        return new StaccatoMidiEventFactory();
    }
}
