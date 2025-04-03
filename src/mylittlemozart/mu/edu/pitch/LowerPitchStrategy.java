package mylittlemozart.mu.edu.pitch;

public class LowerPitchStrategy implements PitchStrategy {
    @Override
    public int modifyPitch(int note) {
        //Lower the pitch by 2 semitones
        return note - 2;
    }
}
