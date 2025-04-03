package mylittlemozart.mu.edu.pitch;

public class HigherPitchStrategy implements PitchStrategy {
    @Override
    public int modifyPitch(int note) {
        //Raise the pitch by 2 semitones
        return note + 2;
    }
}
