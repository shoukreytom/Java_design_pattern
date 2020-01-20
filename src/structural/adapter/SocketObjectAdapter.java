package structural.adapter;

public class SocketObjectAdapter implements SocketAdapter {

    private Socket s = new Socket();

    @Override
    public Volt get9Volt() {
        return convert(s.getVolt(), 13.33);
    }

    @Override
    public Volt get21Volt() {
        return convert(s.getVolt(), 5.71);
    }

    @Override
    public Volt get18Volt() {
        return convert(s.getVolt(), 6.66);
    }

    private Volt convert(Volt v, double i) {
        return new Volt((int) (v.getVolts()/i));
    }
}
