import java.util.ArrayList;
import java.util.List;

public class WhetherOnArea {
    public static void main(String[] args) {
        List<Whether> list = new ArrayList<>();
        list.add(0, new ColdWhetherExt(40, true, "June"));
        list.add(1, new HotWhetherExt(2, false, "May"));
        Area area = new Area(72.0, 132.0, AreaEnum.plain, new HotWhetherExt(1, true, "April"));

        System.out.println("Width - " + area.getWidth() + " longitude - " + area.getLongitude() + " type of area - "
                + area.toWrite() + ", " + list.get(0));
    }
}
