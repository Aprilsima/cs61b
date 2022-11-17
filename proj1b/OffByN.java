public class OffByN implements CharacterComparator{
    public int byn;
    public OffByN(int N) {
        byn=N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        if (diff == byn || diff == (-byn)) {
            return true;
        }
        return false;
    }
}
