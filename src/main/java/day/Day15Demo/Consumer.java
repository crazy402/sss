package day.Day15Demo;

/**
 * @ClassName Consumer
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 10:48
 * @Version 1.0
 **/
public class Consumer implements Runnable {
    private BaoZiPu baoZiPu;

    public Consumer(BaoZiPu baoZiPu) {
        this.baoZiPu = baoZiPu;
    }


    @Override
    public void run() {

        while (true) {
            synchronized (baoZiPu) {
                if (baoZiPu.getFlag() == false) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                baoZiPu.getCount();

                baoZiPu.setFlag(false);

                baoZiPu.notify();

            }
        }

    }
}
