package item07;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.sql.Ref;

public class ReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;
        System.gc();
        Thread.sleep(3000L);
        // 메모리가 충분할 경우 gc 때 softreference가 그대로 남아있을 수 있다.
        System.out.println(soft.get());

        Object strong2 = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong2);
        strong2 = null;
        System.gc();;
        Thread.sleep(3000L);
        // gc 됨
        System.out.println(weak.get());

        BigObject bigobject = new BigObject();
        ReferenceQueue<BigObject> rq = new ReferenceQueue<>();
        PhantomReference<BigObject> phantom = new PhantomReference<>(bigobject, rq);
        bigobject = null;

        System.gc();
        Thread.sleep(3000L);

        // 죽었지만 사라지지 않고 큐에 들어감
        // 자원이 반납되는 시점을 알 수 있다.
        System.out.println(phantom.isEnqueued());
        Reference<? extends BigObject> referece = rq.poll();
        referece.clear();


    }
}
