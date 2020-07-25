class Block {

    int a, b, c, volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    public boolean sameDim(Block ab) {
        if ((ab.a == a) & (ab.b == b) & (ab.c == c))
            return true;
        else
            return false;
    }

    public boolean sameVol(Block ab) {
        if (ab.volume == volume)
            return true;
        else
            return false;
    }

}

class passBlock {
    public static void main(String[] args) {
        Block a;
        a = new Block(10, 5, 2);
        Block b = new Block(10, 5, 2);
        Block c = new Block(25, 2, 2);

        System.out.println("a has same dimensions as b :" + a.sameDim(b));
        System.out.println("a has same dimensions as c :" + a.sameDim(c));
        System.out.println("a has same Volume as c :" + a.sameVol(c));

    }
}