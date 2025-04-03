package mylittlemozart.mu.edu.factories;

/**
 * Abstract factory interface for returning a MidiEventFactory.
 */
public interface MidiEventFactoryAbstract {

    /**
     * Creates a concrete MidiEventFactory (Standard, Legato, Staccato).
     *
     * @return a concrete factory implementing MidiEventFactory
     */
    MidiEventFactory createFactory();
}

