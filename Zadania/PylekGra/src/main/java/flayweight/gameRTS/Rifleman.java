package flayweight.gameRTS;

public class Rifleman {
    private int x;
    private int y;
    private int hpLeft;
    private RiflemanUnitsStats stats;

    public Rifleman(int x, int y) {

        stats =UnitStatsRepository.getRiflemanStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
