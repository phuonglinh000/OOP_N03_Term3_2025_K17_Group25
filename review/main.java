public static void main(String[] args) {
    InheritanceTest test = new InheritanceTest();
    Detergent detergent = test.new Detergent();
    DirtyThing dirtyThing = test.new DirtyThing();
    Brush brush = test.new Brush();

    detergent.dilute(30);
    detergent.apply(dirtyThing);
    detergent.scrub(brush);
    detergent.foam();
    }


