package item07;

import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

    @Test
    void cache() throws InterruptedException {
        PostRepository postRepository = new PostRepository();
        Integer p1 = 1;
        postRepository.getPostById(p1);

        assertFalse(postRepository.getCache().isEmpty());

        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);
        assertTrue(postRepository.getCache().isEmpty());

    }

    @Test
    void backgroundThread() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        PostRepository postRepository = new PostRepository();
        CacheKey key1 = new CacheKey(1);
        postRepository.getPostById(key1);
        Runnable removeOldCache = () -> {
            System.out.println("running removeOldCache task");
            Map<CacheKey, Post> cache = postRepository.getCache();
            Set<CacheKey> cacheKeys = cache.keySet();
            Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
            key.ifPresent(k -> {
                System.out.println("removing " + k);
                cache.remove(k);
            });
        };

        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);
        executor.shutdown();
    }

}