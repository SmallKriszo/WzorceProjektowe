package flayweight.gameRTS;

public class TeslaTank {

    private int x;
    private int y;
    private int hpLeft;
    private TeslaTankUnitStats stats;

    public TeslaTank(int x, int y) {

        stats = UnitStatsRepository.getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}