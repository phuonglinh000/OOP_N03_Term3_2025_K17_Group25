public class flower {
    nt petalCount = 0;
    tring s = new String(“null”);
    Flower(int petals) { petalCount = petals; }
    Flower(String ss) { s = ss; }
    Flower(String s, int petals) {
    this(petals);
    this(s);
    this.s = s;
}
Flower() { this(“hi”, 47); }
}

