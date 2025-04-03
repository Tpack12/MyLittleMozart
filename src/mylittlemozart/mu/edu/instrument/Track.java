package mylittlemozart.mu.edu.instrument;

public class Track {
    private int channel;
    private int instrument;

    //Constructor
    public Track(int channel) {
        this.channel = channel;
    }

    //Getter for instrument
    public int getInstrument() {
        return instrument;
    }
    //Setter for instrument
    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }

    public int getChannel() {
        return channel;
    }
}

