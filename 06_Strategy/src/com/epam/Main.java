package com.epam;

import com.epam.creatures.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //output the zoo
        Orc orc = new Orc();
        orc.identify();
        orc.getWalkBehavior().performWalk();
        orc.getFlyBehavior().performFly();
        System.out.println();

        Troll troll = new Troll();
        troll.identify();
        troll.getWalkBehavior().performWalk();
        troll.getFlyBehavior().performFly();
        System.out.println();

        Pegasus pegasus = new Pegasus();
        pegasus.identify();
        pegasus.getWalkBehavior().performWalk();
        pegasus.getFlyBehavior().performFly();
        System.out.println();

        Elf elf = new Elf();
        elf.identify();
        elf.getWalkBehavior().performWalk();
        elf.getFlyBehavior().performFly();
        System.out.println();

        Harpy harpy = new Harpy();
        harpy.identify();
        harpy.getWalkBehavior().performWalk();
        harpy.getFlyBehavior().performFly();
        System.out.println();

        //conjure somebody
        System.out.println("Choose somebody to conjure");
        String creature;
        Scanner s = new Scanner(System.in);
        creature = s.nextLine();

        switch (getCreature(creature))
        {
            case ELF:
                conjure(elf, new FlyGracefully());
                elf.getFlyBehavior().performFly();
                break;
            case HARPY:
                conjure(harpy, new FlyGracefully());
                harpy.getFlyBehavior().performFly();
                break;
            case ORC:
                conjure(orc, new FlyGracefully());
                orc.getFlyBehavior().performFly();
                break;
            case PEGASUS:
                conjure(pegasus, new FlyGracefully());
                pegasus.getFlyBehavior().performFly();
                break;
            case TROLL:
                conjure(troll, new FlyGracefully());
                troll.getFlyBehavior().performFly();
                break;
        }

    }

    private static void conjure(Creature creature, FlyBehavior flyBehavior){
        creature.setFlyBehavior(flyBehavior);
    }

    private static CreatureEnum getCreature(String creature){
        try {
            return CreatureEnum.valueOf(creature.toUpperCase());
        } catch (IllegalArgumentException e) {
            return CreatureEnum.UNDEFINED;
        }
    }
}
