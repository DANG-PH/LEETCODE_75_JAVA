import java.util.*;

interface XuLiBaiToan {
    void docInput(Scanner sc);
    void thucThi();
    void inKetQua();
}

class XuLiHaiXau {
    private final String xau1;
    private final String xau2;
    public XuLiHaiXau(String xau1, String xau2) {
        this.xau1 = xau1;
        this.xau2 = xau2;
    }
    public String hopNhatHaiXau() {
        String xauKetQua = "";
        int minlength = Math.min(xau1.length(),xau2.length());
        String xauMax = minlength == xau1.length() ? xau2 : xau1;
        for (int i = 0; i < minlength; i++) {
            xauKetQua += "" + xau1.charAt(i) + xau2.charAt(i);
        }
        xauKetQua += xauMax.substring(minlength);
        return xauKetQua;
    }
}

class Solve_1768 implements XuLiBaiToan {
    private String ketQua = "",xau1,xau2;
    @Override
    public void docInput(Scanner sc) {
        xau1 = sc.nextLine();
        xau2 = sc.nextLine();
    }
    @Override
    public void thucThi() {
        XuLiHaiXau xuLiHaiXau = new XuLiHaiXau(xau1,xau2);
        ketQua = xuLiHaiXau.hopNhatHaiXau();
    }
    @Override
    public void inKetQua() {
        System.out.println(ketQua);
    }
}

public class Merge_Strings_Alternately_1768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solve_1768 solve1768 = new Solve_1768();

        solve1768.docInput(sc);
        solve1768.thucThi();
        solve1768.inKetQua();
    }
}
