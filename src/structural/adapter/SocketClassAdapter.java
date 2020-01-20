package structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {

    @Override
    public Volt get9Volt() {
        return convertVolt(getVolt(), 13.33);
    }

    @Override
    public Volt get21Volt() {
        return convertVolt(getVolt(), 5.71);
    }

    @Override
    public Volt get18Volt() {
        return convertVolt(getVolt(), 6.66);
    }

    private Volt convertVolt(Volt volt, double i) {
        return new Volt((int)(volt.getVolts()/i));
    }
}
