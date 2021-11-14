import java.util.TreeSet;

class HeavyBox implements Comparable<HeavyBox> {
    Integer id;
    Integer weigth;

    public HeavyBox(Integer weigth, Integer id) {
        this.weigth = weigth;
        this.id = id;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int compareTo(HeavyBox box) {
        return getWeigth().compareTo(box.weigth);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "id=" + id +
                ", weigth=" + weigth +
                '}';
    }
}

class Boxes {
    public static void main(String[] args) {
        TreeSet<HeavyBox> set = new TreeSet<HeavyBox>();

        set.add(new HeavyBox(500, 1));

        set.add(new HeavyBox(300, 2));

        set.add(new HeavyBox(400, 3));

        set.add(new HeavyBox(100, 4));

        set.add(new HeavyBox(200, 5));

        System.out.println("Sort elements in ascending order : ");
        for (HeavyBox boxes : set) {
            System.out.println(boxes);
        }


    }

}
