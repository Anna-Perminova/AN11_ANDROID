public enum Color {
    PURPLE(138, 43, 226), BLACK(0, 0, 0), WHITE(256, 255, 255);
    private int R, G, B;

    Color(int r, int g, int b) {
        R = r;
        G = g;
        B = b;
    }

    public int getR() {
        return R;
    }

    public int getG() {
        return G;
    }

    public int getB() {
        return B;
    }

    public void check() {
        if (R > 255 || R < 0 || G > 255 || G < 0 || B > 255 || B < 0) {
            System.out.println("Вы вышли за пределы числового диапазона");
        }
    }
}






