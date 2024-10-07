public class Counter implements Runnable {

    private String name;

    public Counter(String name) {
        this.name = name;
    }


    @Override
    public void run(){
        System.out.println(this.getName() + " Sayaç basladı ");

        for(int i=1;i<100; i++){
            System.out.println(this.getName() + " " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
