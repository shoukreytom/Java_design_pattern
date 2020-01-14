package creational.builder.test;

public class Computer {

    //required parameter
    private String RAM;
    private String DISK;

    //optional parameter
    private boolean isMultiCore;
    private boolean isScreenTouch;

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.DISK = builder.DISK;
        this.isMultiCore = builder.isMultiCore;
        this.isScreenTouch = builder.isScreenTouch;
    }

    public boolean isMultiCore() {
        return isMultiCore;
    }

    public boolean isScreenTouch() {
        return isScreenTouch;
    }

    public String getRAM() {
        return RAM;
    }

    public String getDISK() {
        return this.DISK;
    }

    public static class ComputerBuilder {

        //required parameter
        private String RAM;
        private String DISK;

        //optional parameter
        private boolean isMultiCore;
        private boolean isScreenTouch;

        public ComputerBuilder(String ram,String disk) {
            this.RAM = ram;
            this.DISK = disk;
        }

        public ComputerBuilder setIsMultiCore(boolean isMultiCore) {
            this.isMultiCore = isMultiCore;
            return this;
        }

        public ComputerBuilder setIsScreenTouch(boolean isScreenTouch) {
            this.isScreenTouch = isScreenTouch;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
