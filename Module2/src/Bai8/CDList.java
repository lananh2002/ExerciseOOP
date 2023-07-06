package Bai8;
import java.util.Arrays;

public class CDList {
    private CD[] cds;
    private int count;

    public CDList(int size) {
        cds = new CD[size];
        count = 0;
    }

    public void addCD(CD cd) {
        if (count < cds.length) {
            cds[count] = cd;
            count++;
            System.out.println("CD đã được thêm vào danh sách.");
        } else {
            System.out.println("Danh sách CD đã đầy. Không thể thêm CD mới.");
        }
    }

    public int getCDCount() {
        return count;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < count; i++) {
            totalCost += cds[i].getPrice();
        }
        return totalCost;
    }

    public void sortByCostDescending() {
        Arrays.sort(cds, 0, count, (cd1, cd2) -> Double.compare(cd2.getPrice(), cd1.getPrice()));
    }

    public void sortByTitleAscending() {
        Arrays.sort(cds, 0, count, (cd1, cd2) -> cd1.getTitle().compareToIgnoreCase(cd2.getTitle()));
    }

    public void displayCDs() {
        for (int i = 0; i < count; i++) {
            System.out.println(cds[i]);
        }
    }
}
