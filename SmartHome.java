interface Connectable {
    void connect();
    void disconnect();
}

interface Switchable {
    void turnOn();
    void turnOff();
}

interface Lockable {
    void lock();
    void unlock();
}
abstract class SmartDevice {
    protected String id;
    protected String nama;
    protected int daya;
    protected String status;

    public SmartDevice(String id, String nama, int daya) {
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this.status = "Mati";
    }

    public abstract String deviceDetails();
}

class SmartTv extends SmartDevice implements Connectable, Switchable {
    private int channel;
    private int volume;
    private String koneksi;

    public SmartTv(String id, String nama, int daya, int channel, int volume) {
        super(id, nama, daya);
        this.channel = channel;
        this.volume = volume;
        this.koneksi = "Tidak Terhubung";
    }

    public void turnOn() {
        status = "Menyala";
    }

    public void turnOff() {
        status = "Mati";
    }

    public void connect() {
        koneksi = "WIFI";
    }

    public void disconnect() {
        koneksi = "Tidak Terhubung";
    }

   
}
class SmartSpeaker extends SmartDevice implements Connectable, Switchable {
    private int volume;
    private String koneksi;

    public SmartSpeaker(String id, String nama, int daya, int volume) {
        super(id, nama, daya);
        this.volume = volume;
        this.koneksi = "Tidak Terhubung";
    }
}   