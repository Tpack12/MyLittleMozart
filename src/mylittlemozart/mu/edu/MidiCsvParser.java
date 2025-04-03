package mylittlemozart.mu.edu;

import javax.sound.midi.ShortMessage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Parses a CSV file and returns a list of MidiEventData objects.
// Each line in the CSV must follow the format:
// startEndTick, Note_on_c/Note_off_c, channel, note, velocity, instrument

public class MidiCsvParser {

     // Parses the given CSV file and constructs a list of MidiEventData.
     // @param filePath the path to the CSV file
     // @return List of parsed MidiEventData
     // @throws IOException if reading the file fails
     
    public static List<MidiEventData> parseCsv(String filePath) throws IOException {
        List<MidiEventData> events = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            if (tokens.length != 6) continue;

            int tick = Integer.parseInt(tokens[0].trim());
            int noteOnOff = tokens[1].trim().equalsIgnoreCase("Note_on_c") ? ShortMessage.NOTE_ON : ShortMessage.NOTE_OFF;
            int channel = Integer.parseInt(tokens[2].trim());
            int note = Integer.parseInt(tokens[3].trim());
            int velocity = Integer.parseInt(tokens[4].trim());
            int instrument = Integer.parseInt(tokens[5].trim());

            events.add(new MidiEventData(tick, velocity, note, channel, instrument, noteOnOff));
        }

        br.close();
        return events;
    }
}
