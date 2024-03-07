package clients;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String clinicName;
    private List<Staff> staff = new ArrayList<>();
    private List<Animals> anim = new ArrayList<>();

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.staff = new ArrayList<>();
        this.anim = new ArrayList<>();
    }

    public void removeStaff(Staff person) {
        staff.remove(person);
    }

    public void addStaff(Staff person) {
        staff.add(person);
    }

    public List<Animals> listFlyables() {
        List<Animals> flyables = new ArrayList<>();
        for (Animals animals : anim) {
            if (animals instanceof Flyable) {
                ((Flyable) animals).fly();
            }
        }
        return flyables;
    }
    public List<Animals> listGoable() {
        List<Animals> goable = new ArrayList<>();
        for (Animals animals : anim) {
            if (animals instanceof Goable) {
                ((Goable) animals).run();
            }
        }
        return goable;
    }
    public List<Animals> listSwimable() {
        List<Animals> swimable = new ArrayList<>();
        for (Animals animals : anim) {
            if (animals instanceof Swimable) {
                ((Swimable) animals).swim();
            }
        }
        return swimable;
    }
}

