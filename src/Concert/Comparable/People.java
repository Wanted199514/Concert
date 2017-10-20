package Concert.Comparable;

import com.sun.istack.internal.NotNull;

public class People implements Comparable {
    String name;
    int razmerUsovAndBroshek;
    boolean woman;

    public People(String name, int razmerUsovAndBroshek, boolean woman) {
        this.name = name;
        this.razmerUsovAndBroshek = razmerUsovAndBroshek;
        this.woman = woman;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        People entry = (People) o;
        int result = entry.razmerUsovAndBroshek - razmerUsovAndBroshek;
        if (result != 0) {
            return result / Math.abs(result);
        }
        return result;
    }
}
