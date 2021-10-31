import java.util.Random;
import java.util.Scanner;
public class Patient {
    private boolean mask;
    private boolean online;
    private boolean perill;
    public enum Vaccine {
        SPUTNIC("Sputnic"), EPIVACCORONA("EpicVacCorona"), COVIVAC("CoviVac");
        private String name;
        Vaccine(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public Patient(boolean mask, boolean online, boolean perill) {
        this.mask = mask;
        this.online = online;
        this.perill = perill;
    }

    public boolean getMask() {
        return mask;
    }

    public void setMask(boolean mask) {
        this.mask = mask;
    }

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean getPerill() {
        return perill;
    }

    public void setPerill(boolean perill) {
        this.perill = perill;
    }
}