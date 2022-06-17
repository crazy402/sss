package day.Day15Demo;

/**
 * @ClassName Producer
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 10:45
 * @Version 1.0
 **/
public class Producer implements Runnable {
    private BaoZiPu baoZiPu;

    public Producer(BaoZiPu baoZiPu) {
        this.baoZiPu = baoZiPu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZiPu) {

                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (baoZiPu.getFlag()) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                baoZiPu.setCount();

                baoZiPu.setFlag(true);

                baoZiPu.notify();

            }

        }
    }
}
