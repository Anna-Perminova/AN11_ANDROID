public class Person implements Iperson{
    private Boots boots;
    private Jacket jacket;
    private Pants pants;
    private String firm;
    private String name;

    public Person(String firm, Boots boots, Jacket jacket, Pants pants, String name) {
        this.firm = firm;
        this.boots = boots;
        this.jacket = jacket;
        this.pants = pants;
        this.name = name;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        pants.putOn();
        jacket.putOn();
        boots.putOn();
        pants.takeOff();
        jacket.takeOff();
        boots.takeOff();

    }

    @Override
    public String getFirm() {
        return firm;
    }
}
