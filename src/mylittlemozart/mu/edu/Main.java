package mylittlemozart.mu.edu;

import mylittlemozart.mu.edu.factories.*;
import mylittlemozart.mu.edu.instrument.*;
import mylittlemozart.mu.edu.pitch.*;
import javax.sound.midi.*;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        try {
            // Step 1: Parse CSV into MIDI event data
            List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mysterysong.csv");

            // Step 2: Create sequence and track
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            Track track = sequence.createTrack();

            // Step 3: Use Abstract Factory to select style
            MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
            // factoryAbstract = new LegatoMidiEventFactoryAbstract();
            // factoryAbstract = new StaccatoMidiEventFactoryAbstract();
            MidiEventFactory factory = factoryAbstract.createFactory();

            // Step 4: Apply instrument strategies
            InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
            instrumentStrategy.applyInstrument(track, 0);
            instrumentStrategy = new TrumpetStrategy();
            instrumentStrategy.applyInstrument(track, 1);

            // Step 5: Select pitch strategy
            PitchStrategy pitchStrategy = new HigherPitchStrategy();
            // pitchStrategy = new LowerPitchStrategy();

            // Step 6: Loop through events and add to track
            for (MidiEventData event : midiEvents) {
                int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
                modifiedNote = pitchStrategy.modifyPitch(modifiedNote); // Optional extra pitch shift

                if (event.getNoteOnOff() == ShortMessage.NOTE_ON) {
                    track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel()));
                } else {
                    track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
                }
            }

            // Step 7: Play sequence
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();

            while (sequencer.isRunning()) {
                Thread.sleep(100);
            }

            Thread.sleep(500);
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
