import java.util.Comparator;

public class Mark<T extends Number> implements Comparable {
    T mark;

    public Mark(T mark) {
        this.mark = mark;
    }

    public boolean sameAny(Mark<?> ob) {
        return roundMark() == ob.roundMark();
    }

    public double roundMark() {
        return Math.round(mark.doubleValue());
    }

    public T getMark() {
        return this.mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Object obj) {
        Mark newMark = (Mark) obj;
        if (this.roundMark() < newMark.roundMark()) {
            return -1;
        } else {
            if (this.roundMark() > newMark.roundMark()) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return mark.toString();
    }
}
