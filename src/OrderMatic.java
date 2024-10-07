
public class OrderMatic implements Runnable{
    private  int orderNo;
    private final Object LOCK = new Object();

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public OrderMatic(int orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

       synchronized (LOCK){
           this.orderNo++;
       }
        System.out.println(Thread.currentThread().getName() + " - OrderNo " + this.getOrderNo());


    }
}
