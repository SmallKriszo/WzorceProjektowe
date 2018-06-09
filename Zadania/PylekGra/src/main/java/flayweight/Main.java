package flayweight;

import flayweight.gameRTS.Destroyer;
import flayweight.gameRTS.Rifleman;
import flayweight.gameRTS.TeslaTank;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<Object>activeUnits = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Destroyer(0,0));


        }
    }
}
